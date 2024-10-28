package VerifyingWebPage;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyingRedBusPageUsingURL {

	public static void main(String[] args) 
	{
		String expected_result="https://www.redbus.in/";
       
		//Open The Browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the Browser
		driver.manage().window().maximize();
		// enter into web page
		driver.get(expected_result);
		String actual_result = driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("I am Red Bus Web Page");
		}
		else {
			System.out.println("I am Not Red Bus Web Page");
		}
		driver.close();
		
		
	}

}
