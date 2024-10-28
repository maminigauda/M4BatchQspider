package VerifyingWebPage;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyingWebPageByUsingTitle {

	public static void main(String[] args) throws InterruptedException 
	{
		String expected_result="Demo Web Shop";
		//Open The Browser
		ChromeDriver driver=new ChromeDriver();
		//maximize Browser
		driver.manage().window().maximize();
		//Waiting Condition
		Thread.sleep(3000);
		//Enter into The DWS Page
		driver.navigate().to("https://demowebshop.tricentis.com/");
		String actual_result=driver.getTitle();
		if(expected_result.equals(actual_result))
		{
			System.out.println(" i am in DWS Home Page");
		}
		else 
		{
			System.out.println(" i am in DWS Home Page");
			
		}
		Thread.sleep(3000);
		driver.quit();
		

	}
}