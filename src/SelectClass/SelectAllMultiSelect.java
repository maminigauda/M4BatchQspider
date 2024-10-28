package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		//Open The Browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting Condition
		Thread.sleep(2000);
		//enter into web page
		driver.get("file:///C:/Users/lenovo/Downloads/demo.html");
		WebElement multi_Select = driver.findElement(By.id("multiple_cars"));
		System.out.println("Test Case Pass");
		Thread.sleep(2000);
		Select sel=new Select(multi_Select);
//		for(int i=0;i<12;i++)
//		{
//			sel.selectByIndex(i);
//			Thread.sleep(2000);
//		}
		//to select the all Single select By using Method
		List<WebElement> multi_menu = sel.getOptions();
		int i=0;
		for (WebElement webElement : multi_menu) 
		{
			sel.selectByIndex(i++);
			
		}

	}

}
