package Shoes;

import org.openqa.selenium.chrome.ChromeDriver;

public class CrocsShoes {

	public static void main(String[] args) {
         
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.crocs.in/");
		
		driver.close();
	}

}
