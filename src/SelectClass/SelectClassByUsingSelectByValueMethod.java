package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassByUsingSelectByValueMethod {

	public static void main(String[] args) throws InterruptedException {
		// Open The Browser
		WebDriver driver=new ChromeDriver();
		//maximize the Browser
		driver.manage().window().maximize();
		//waiting Condition
		Thread.sleep(2000);
		//entrer into Web Page
		driver.get("file:///C:/Users/lenovo/Downloads/demo.html");
		//to find web Element
		WebElement single_select = driver.findElement(By.id("standard_cars"));
		Thread.sleep(2000);
		//to create object
		Select sel=new Select(single_select);
		Thread.sleep(2000);
		System.out.println("Its A Land Rover Car");
		sel.selectByVisibleText("Land Rover");
		Thread.sleep(2000);
		System.out.println("Its A Mercedes Cars");
		sel.selectByValue("merc");
		Thread.sleep(2000);
		System.out.println("Its A BMW Cars");
		sel.selectByIndex(2);
		Thread.sleep(2000);
		driver.close();
		

	}

}
