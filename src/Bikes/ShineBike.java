package Bikes;

import org.openqa.selenium.chrome.ChromeDriver;

public class ShineBike 
{
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.bikewale.com/honda-bikes/shine/");
		
		driver.close();
		

	}

}
