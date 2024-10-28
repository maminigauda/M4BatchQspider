package VerifyingWebPage;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageDemoWebShopByUsingURL {

	public static void main(String[] args) throws InterruptedException 
	{
		String expected_result="https://demowebshop.tricentis.com/";
		
		//Open The Browser
		ChromeDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//waiting Condition
		Thread.sleep(3000);
		
		//enter into the DWS page
		driver.get(expected_result);
		
		String actual_result = driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("I Am In Demo Web Shop Page");
		}
		else
		{
			System.out.println("I Am Not Demo Web Shop Page");
		}
		
		driver.close();
		

	}

}
