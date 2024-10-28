package PopUp;

import org.openqa.selenium.By;

public class VerifyAlert extends CrossBrowserTesting {

	public static void main(String[] args) throws InterruptedException {
		preCondtion("chrome");
		Thread.sleep(2000);
		String expected_result="https://demowebshop.tricentis.com/";
		String actual_result=driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("i am DWS page");
			driver.findElement(By.cssSelector("input[value='Search']")).click();
			Thread.sleep(2000);
			driver.switchTo().alert();
			Thread.sleep(2000);
			//click  webElemt In Main Page
			//driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
			//it will give above line UnhandledAlertException
			//how to Verify PopUp.for Verifying The PopUp by using try and catch block
			try
			{
				driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
				System.out.println("PopUp is not Displayed.....");
			}
			catch (Exception e) 
			{
				System.out.println("PopUp is Displayed......");
			}
		}
		else
		{
			System.out.println("I am NOt DWS page");
		}
	}

}
