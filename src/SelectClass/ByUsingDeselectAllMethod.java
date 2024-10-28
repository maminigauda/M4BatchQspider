package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ByUsingDeselectAllMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		String expected_result="file:///C:/Users/lenovo/Downloads/demo.html";
		// Open the Browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting Condition
		Thread.sleep(2000);
		//enter into Web Page
		driver.get("file:///C:/Users/lenovo/Downloads/demo.html");
		String actual_result=driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("I am AutoMateTest Page...");
			WebElement multi_select = driver.findElement(By.id("multiple_cars"));
			
			Select sel=new Select(multi_select);
			Thread.sleep(2000);
			int i=0;
			List<WebElement> cars = sel.getOptions();
			for (WebElement webElement : cars) 
			{
				sel.selectByIndex(i++);
				Thread.sleep(1000);
				
			}
			Thread.sleep(3000);
			sel.deselectAll();
		}
		else
		{
			System.out.println("I am not AutoMateTest Page...");
			driver.close();
		}
		Thread.sleep(20000);
		driver.close();

	}

}
