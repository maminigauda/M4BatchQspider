package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class MoveToForwardAndBackWardWithRefesh {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		
		//maximize The Window
		driver.manage().window().maximize();
		
		//Waiting Condition
		Thread.sleep(2000);
		
		//Enter into WebPage
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
