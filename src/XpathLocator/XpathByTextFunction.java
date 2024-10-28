package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByTextFunction {

	public static void main(String[] args) throws InterruptedException {
		String expected_result="https://demowebshop.tricentis.com/";
		//open the Browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
		//enter into DWS page
		driver.get("https://demowebshop.tricentis.com/");
		String actual_result=driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println(" i am DWS Page");
			Thread.sleep(3000);
			WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
			Thread.sleep(3000);
			String data = register.getText();
			Thread.sleep(3000);
			System.out.println(data);
			Thread.sleep(3000);
			driver.close();  
		}
		else
		{
			System.out.println(" i am not DWS page");
			driver.close();
		}
		Thread.sleep(3000);
		driver.close();
	
		

	}

}
