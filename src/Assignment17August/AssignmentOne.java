package Assignment17August;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOne {

	public static void main(String[] args) throws InterruptedException {
		String expected_result="https://demowebshop.tricentis.com/";
		// open the Browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
		//enter into DWS page
		driver.get("https://demowebshop.tricentis.com/");
		String actual_result=driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("i am DWS page");
			driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[value='Add to cart']")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[class='recipient-name']")).sendKeys("Deva");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[class='recipient-email']")).sendKeys("deva1992@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[class='sender-name']")).sendKeys("Mamini");
			Thread.sleep(2000);
			driver.findElement(By.id("giftcard_1_SenderEmail")).sendKeys("mamini123@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.id("giftcard_1_Message")).sendKeys("I Want To Buy This Product");
			Thread.sleep(2000);
			driver.findElement(By.id("addtocart_1_EnteredQuantity")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("addtocart_1_EnteredQuantity")).sendKeys("3");
			Thread.sleep(2000);
		    driver.findElement(By.id("add-to-cart-button-1")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.className("cart-label")).click();
		    Thread.sleep(2000);
		   
		    }
		else
		{
			System.out.println(" i am not DWs page");
			driver.close();
		}
		Thread.sleep(3000);
		driver.close();

	}

}
