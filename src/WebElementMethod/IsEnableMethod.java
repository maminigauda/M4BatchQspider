package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethod {

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
		//enter into DWS page
		driver.navigate().to("https://demowebshop.tricentis.com/");
		//to find the WebElement
		WebElement search_field = driver.findElement(By.id("small-searchterms"));
		if(search_field.isEnabled())
		{
			System.out.println("Element Is Enabled");
			search_field.sendKeys("Mobile");
		}
		else
		{
			System.out.println(" Element is DIsable...");
			driver.close();
		}
		Thread.sleep(3000);
		driver.close();
		

	}

}
