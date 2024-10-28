package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ByUsingGetAllSelectOptionMethod {

	public static void main(String[] args) throws InterruptedException {
		String expected_result="file:///C:/Users/lenovo/Downloads/demo.html";
		//open the Browser
		WebDriver driver=new ChromeDriver();
		//maximize the Browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
		//enter Into web Page
		driver.get("file:///C:/Users/lenovo/Downloads/demo.html");
		String actual_result=driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("I Am Demo Testing Page....");
			WebElement multi = driver.findElement(By.id("multiple_cars"));
			Select sel=new Select(multi);
			List<WebElement> multi_select = sel.getOptions();
			int i=0;
			for (WebElement webElement : multi_select) 
			{
				Thread.sleep(2000);
				sel.selectByIndex(i++);
			}
			Thread.sleep(2000);
			sel.getAllSelectedOptions();
		}
		else
		{
			System.out.println("I am Not Demo Testing Page....");
			driver.close();
		}
		Thread.sleep(2000);
		driver.close();

	}

}
