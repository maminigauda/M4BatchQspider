package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ByUsingIsMultipleMethod {

	public static void main(String[] args) throws InterruptedException {
		// Open the browser
		WebDriver driver=new ChromeDriver();
		//maximize the Browser
		driver.manage().window().maximize();
		//Waiting Condition
		Thread.sleep(30000);
		//Enter Into web page
		driver.get("file:///C:/Users/lenovo/Downloads/demo.html");
//		WebElement single_select = driver.findElement(By.id("standard_cars"));
//		Select sel=new Select(single_select);
//		Thread.sleep(2000);
//		System.out.println("It Is Audi Car");
//		sel.selectByVisibleText("Audi");
//		Thread.sleep(2000);
//		sel.deselectByVisibleText("Audi");
//		//we will get Exception:That Exception Is UnsupportedOperation Exception
//		driver.close();
		//to find the web element
		WebElement multi_select = driver.findElement(By.id("multiple_cars"));
		Select sel=new Select(multi_select);
		if(sel.isMultiple())
		{
			System.out.println("i am  multiple dropdown menu bar");
			sel.selectByIndex(3);
			Thread.sleep(2000);
			sel.deselectByIndex(3);
		}
		else
		{
			System.out.println("i am not multiple dropdown menu bar");
			sel.deselectByIndex(3);
		}
		Thread.sleep(3000);
		driver.close();
	}

}
