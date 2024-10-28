package Assignment07August;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToFlipKartWebPage {

	public static void main(String[] args) 
	{
		//Open The Browser
		ChromeDriver driver=new ChromeDriver();
		
		//Maximize The Window
		driver.manage().window().maximize();
		
		//Enter Into  FilpKart Web Page
		driver.navigate().to("https://www.flipkart.com/");
		
		//Close The Window
		driver.close();
		

	}

}
