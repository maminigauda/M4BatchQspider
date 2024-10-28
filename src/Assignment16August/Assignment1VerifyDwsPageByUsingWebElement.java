package Assignment16August;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1VerifyDwsPageByUsingWebElement {

	public static void main(String[] args) throws InterruptedException {
		// open the browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting Condition
		Thread.sleep(3000);
		//enter into DWS page
		driver.get("https://demowebshop.tricentis.com/");
		WebElement poll = driver.findElement(By.xpath("//strong[text()='Community poll']"));
		Thread.sleep(3000);
		String data = poll.getText();
		Thread.sleep(3000);
		System.out.println(data);
		if(poll.isDisplayed())
		{
			Thread.sleep(3000);
			System.out.println("i am DWS Page");
			List<WebElement> common = driver.findElements(By.xpath("//div[@class='header-links']/ul/li/a"));
		    for (int i = 0; i < common.size(); i++) 
		    {
		    	Thread.sleep(3000);
		    	common.get(i).click();
		    	driver.navigate().back();
		    }
		}
		else 
		{
			System.out.println("i am not Dws Page");
			
		}
		Thread.sleep(3000);
		driver.close();

	}

	private static Object navigate() {
		// TODO Auto-generated method stub
		return null;
	}

}
