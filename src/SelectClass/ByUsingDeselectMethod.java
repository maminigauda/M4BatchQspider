package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ByUsingDeselectMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		String expected_result="file:///C:/Users/lenovo/Downloads/demo.html";
		// Open The Browser
		WebDriver driver=new ChromeDriver();
		//Maximize The Browser
		driver.manage().window().maximize();
		//Waiting Condition
		Thread.sleep(2000);
		//Enter inTo WebPage
		driver.get("file:///C:/Users/lenovo/Downloads/demo.html");
		String acrtal_result=driver.getCurrentUrl();
		if(expected_result.equals(acrtal_result))
		{
			System.out.println("I am DWs page..");
			WebElement multi_select = driver.findElement(By.id("multiple_cars"));
			Select sel=new Select(multi_select);
			sel.selectByVisibleText("BMW");
			Thread.sleep(2000);
			sel.deselectByVisibleText("BMW");
		}
		else
		{
			System.out.println("I am  not DWs page..");
			driver.close();
		}
		Thread.sleep(2000);
		driver.close();
		
	

	}

}
