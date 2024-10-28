package Bikes;

import org.openqa.selenium.chrome.ChromeDriver;

public class KtmBike 
   {
	public static void main(String[] args) 
	{
		//Open The Browser
		ChromeDriver driver= new ChromeDriver();
		 
		//Maximize Window
		driver.manage().window().maximize();
		
		//enter into the web Page
		driver.get("https://www.bikewale.com/ktm-bikes/");
		
		//close the window
		driver.close();
 
	}

   }
