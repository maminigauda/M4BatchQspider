package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {

	public static void main(String[] args) throws InterruptedException {
		String expected_result="https://demowebshop.tricentis.com/";
		//open the browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
		//enter into web page
		driver.get("https://demowebshop.tricentis.com/");
		String actual_result=driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println(" i am DWS page");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Mobile");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@value='Search']")).click();
		}
		else
		{
			System.out.println("i am not DWs page");
			driver.close();
		}
		Thread.sleep(3000);
		driver.close();
		

	}

}
