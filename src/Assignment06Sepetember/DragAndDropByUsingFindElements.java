package Assignment06Sepetember;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragAndDropByUsingFindElements {

	public static void main(String[] args) throws InterruptedException 
	{
		String expected_result="http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";
		// open the browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(2000);
		//enter into web Page
		driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		String actual_result=driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("i am DHTML GOODIES Page...");
			List<WebElement> source_capitals = driver.findElements(By.className("dragableBox"));
			//driver.findElements(By.className(""))
			
		}
		else
		{
			System.out.println("i am  not DHTML GOODIES Page...");
		}

	}

}
