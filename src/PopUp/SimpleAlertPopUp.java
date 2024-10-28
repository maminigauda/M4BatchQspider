package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class SimpleAlertPopUp extends CrossBrowserTesting {

	public static void main(String[] args) throws InterruptedException 
	{
		preCondtion("Chrome");
		Thread.sleep(2000);
		String expected_result="https://demowebshop.tricentis.com/";
		String actual_result=driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("I am DWS Page");
			driver.findElement(By.cssSelector("input[value='Search']")).click();
			Thread.sleep(2000);
			//for Handling The PopUp i.e my controlor is  present alert
			//driver.switchTo().alert().accept();
			//if want to text 
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(2000);
			alert.accept();
		}
		else
		{
			System.out.println("I am not DWS Page");
		}
		Thread.sleep(2000);
		postCondition("quit");
		
	}

}
