package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllSingleSelect {

	public static void main(String[] args) throws InterruptedException {
		// Open The Browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting Condition
		Thread.sleep(3000);
		//enter into web page
		driver.get("file:///C:/Users/lenovo/Downloads/demo.html");
		WebElement single_select = driver.findElement(By.id("standard_cars"));
		Thread.sleep(2000);
		Select sel=new Select(single_select);
//		for(int i=0;i<12;i++)
//		{
//			sel.selectByIndex(i);
//			Thread.sleep(2000);
//		}
		List<WebElement> single_menu = sel.getOptions();
		int i=0;
		for (WebElement webElement : single_menu) 
		{
			Thread.sleep(2000);
			sel.selectByIndex(i++);
		}
		Thread.sleep(2000);
		driver.close();

	}

}
