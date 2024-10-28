package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ByUsingGetFirstSelectOptionMethod {

	public static void main(String[] args) throws InterruptedException {
		String expected_result="file:///C:/Users/lenovo/Downloads/demo.html";
		//open the Browser
		WebDriver driver=new ChromeDriver();
		//maximize the Browser
		driver.manage().window().maximize();
		//waiting Condition
		Thread.sleep(3000);
		//Enter into Web page
		driver.get("file:///C:/Users/lenovo/Downloads/demo.html");
		String actual_result=driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("I am Selenium Testing");
			WebElement first_select = driver.findElement(By.id("standard_cars"));
			Thread.sleep(2000);
			Select sel=new Select(first_select);
			Thread.sleep(3000);
			sel.getFirstSelectedOption();
			Thread.sleep(2000);
			}
		else
		{
			System.out.println("I am not Selenium Testing");
			driver.close();
		}
		Thread.sleep(2000);
		driver.close();

	}

}
