package BasicUtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferenceBetCloseAndQuitMethod 
{
	public static WebDriver driver;
	public static void preCondition() throws InterruptedException
	{
		//open the browser
		driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
		//enter into DWS page
		driver.get("https://demowebshop.tricentis.com/");
	}
	public static void postCondition()
	{
		System.out.println("Thank you pls come again");
		driver.close();
	}
	public static void postCondition1()
	{
		System.out.println("Thank you pls come again");
		driver.quit();
	}

}
