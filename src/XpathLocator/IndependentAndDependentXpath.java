package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentAndDependentXpath {

	public static void main(String[] args) throws InterruptedException 
	{
		String expected_result="https://demowebshop.tricentis.com/";
		//open the browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
		//enter in to DWs page
		driver.get("https://demowebshop.tricentis.com/");
		String actual_result = driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("I am DWS page");
			driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
			WebElement verify = driver.findElement(By.xpath("//h1[text()='Digital downloads']"));
			if(verify.isDisplayed())
			{
				System.out.println(" i am Digital download page...");
				Thread.sleep(2000);
				WebElement price = driver.findElement(By.xpath("//a[text()='3rd Album']/../following-sibling::div[3]/div/span"));
				System.out.println(price.getText());
				Thread.sleep(2000);
				WebElement music = driver.findElement(By.xpath("//a[text()='Music 2']/../following-sibling::div[3]/div/span"));
				System.out.println(music.getText());
				Thread.sleep(2000);
				WebElement music2 = driver.findElement(By.xpath("(//a[text()='Music 2']/../following-sibling::div[3]/div/span)[2]"));
				System.out.println(music2.getText());
			}
			else
			{
				System.out.println(" I am Not Digital download Page.....");
			}
		}
		else
		{
			System.out.println(" I am Not DWS page");
			driver.close();
		}
		Thread.sleep(2000);
		driver.close();

	}

}
