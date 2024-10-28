package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassByUsingSelectByVisibleTextMethod {
	public static void main(String[] args) throws InterruptedException 
	{
		//Open The browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
		//enter into web page
		driver.get("file:///C:/Users/lenovo/Downloads/demo.html");
		//find the WebElement
		WebElement single_select = driver.findElement(By.id("standard_cars"));
		Thread.sleep(3000);
		//By create Object Of SelectClass
		Select sel=new Select(single_select);
		//To Perform Action By Using Method
		sel.selectByVisibleText("Land Rover");
		Thread.sleep(2000);
		driver.close();
		
	}

}