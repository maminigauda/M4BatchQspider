package Shoes;

import org.openqa.selenium.chrome.ChromeDriver;

public class PumaShoes {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://in.puma.com/in/");
		
		driver.close();

	}

}
