package Bikes;

import org.openqa.selenium.chrome.ChromeDriver;

public class RevoltBike 
{
	public static void main(String[] args) 
	{
     
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.revoltmotors.com/");
		
		driver.close();
	}

}
