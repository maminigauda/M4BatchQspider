package ActionsClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingByKeyBoardAction {

	public static void main(String[] args) throws InterruptedException {
		String expected_result="https://demowebshop.tricentis.com/";
		//open the Browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(2000);
		//enter into DWS page
		driver.navigate().to("https://demowebshop.tricentis.com/");
		String actual_result=driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("I am DWS page....");
			Actions act=new Actions(driver);
			act.keyDown(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			act.keyDown(Keys.PAGE_UP).build().perform();
		}
		else
		{
			System.out.println("I am Not DWs page...");
			driver.close();
		}
		Thread.sleep(2000);
		driver.close();

	}

}
