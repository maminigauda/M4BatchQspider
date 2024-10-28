package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class NaviGateMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		//Open The Browser
		ChromeDriver driver=new ChromeDriver();
		//Maximize The Window
		
		driver.manage().window().maximize();
		//Enter into Web Page
		
		//Waiting Condition
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		//Close The Window
		
		driver.close();
		

	}

}
