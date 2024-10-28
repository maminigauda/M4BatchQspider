package VerifyingWebPage;

import org.openqa.selenium.chrome.ChromeDriver;

public class VeriFyingDWS_To_RedBusWebPageByUsingTitle {

	public static void main(String[] args) throws InterruptedException {

		String expected_resultDWs="Demo Web Shop";
		String expected_resultRedbus="Bus Ticket Booking Online made Easy, Secure with Top Bus Operators - redBusr";
		//open the browser
		ChromeDriver driver=new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//Waiting Condition
		Thread.sleep(3000);
		driver.navigate().to("https://demowebshop.tricentis.com/");
		String actual_resultDWs=driver.getTitle();
		driver.navigate().to("https://www.redbus.in/");
	
		String actual_resultRedbus=driver.getTitle();
		if(expected_resultDWs.equals(actual_resultDWs))
		{
			System.out.println("I am Demo Web Shop Page");
			if(expected_resultRedbus.equals(actual_resultRedbus))
			{
				System.out.println("I am In Red Bus Page");
			}
			else 
			{
				System.out.println("I am  Not In Red Bus Page");	
			}
		}
		else 
		{
			System.out.println("I am not  Demo Web Shop Page");
		}
		
		//Close The Window
		driver.close();
		
		
	}

}

