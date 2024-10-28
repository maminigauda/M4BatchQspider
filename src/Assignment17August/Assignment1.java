package Assignment17August;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		String expected_result = "https://demowebshop.tricentis.com/";
		// open the Browser
		ChromeDriver driver=new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//waiting Condition
		Thread.sleep(3000);
		//enter into DWS page
		driver.get("https://demowebshop.tricentis.com/");
		//to varifying page using url
		String actual_result = driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("i am DWS page");
			driver.findElement(By.xpath("//ul[@class='top-menu']/li[7]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[value='Add to cart']")).click();
			Thread.sleep(2000);
			driver.findElement(By.className("recipient-name")).sendKeys("Iphone");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='giftcard_1_RecipientEmail']")).sendKeys("iphone123@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='sender-name']")).sendKeys("Mamini");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='sender-email']")).sendKeys("mamini12@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//textarea[@cols='20']")).sendKeys("hii i am giftCard");
			Thread.sleep(2000);
			driver.findElement(By.id("addtocart_1_EnteredQuantity")).clear();
			driver.findElement(By.id("addtocart_1_EnteredQuantity")).sendKeys("3");
			driver.findElement(By.xpath("//input[@id='add-to-cart-button-1']")).click();
			driver.findElement(By.className("cart-label")).click();
			Thread.sleep(3000);
			
			
			
		}
		else 
		{
			System.out.println("i am not DWS page");
			driver.close();
		}
		Thread.sleep(3000);
		//driver.close();

	}

}
