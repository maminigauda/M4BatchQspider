package DriverOfUtilityClass;

import org.openqa.selenium.By;

import UtilityClass.BaseClassDwsWebPage;

public class UtilityClassDwsWebPage extends  BaseClassDwsWebPage {

	public static void main(String[] args) throws InterruptedException 
	{
		String expected_result="https://demowebshop.tricentis.com/";
		Thread.sleep(2000);
		preCondition();
		Thread.sleep(2000);
		//preCondition1();
		//Thread.sleep(2000);
		//preCondition2();
		String actual_result=driver.getCurrentUrl();
		System.out.println(actual_result);
		if(expected_result.equals(actual_result))
		{
			System.out.println("I am DWS Page");
			driver.findElement(By.id("small-searchterms")).sendKeys("Laptop");
			Thread.sleep(2000);
			System.out.println("Item Search SuccessFully");
		}
		else
		{
			System.out.println("I am Not DWS Page");
			//it will close current window
			postCondition1();
		}
		Thread.sleep(2000);
		postCondition1();
		

	}

}
