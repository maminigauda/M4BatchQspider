package Assignment07August;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException 
	{
		//Open The Browser
		ChromeDriver driver=new ChromeDriver();
		
		//Maximize The Window
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 
		 //Enter Into  Demo Web Shop Web Page
		 driver.navigate().to("https://demowebshop.tricentis.com/");
		 Thread.sleep(3000);
		 
		 //Enter Into The FilpKart Web Page
		 driver.get("https://www.flipkart.com/");
		 Thread.sleep(3000);
		 
		 //Navigate to Back To Demo Web shop
		 driver.navigate().back();
		 Thread.sleep(3000);
		 
		 //Navigate To FlipKart WebPage
		 driver.navigate().forward();
		 Thread.sleep(3000);
		 
		 //Refresh The WebPage
		 driver.navigate().refresh();
		 Thread.sleep(3000);
		 
		 driver.close();
	}

}
