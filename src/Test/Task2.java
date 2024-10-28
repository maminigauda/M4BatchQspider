package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Task2 extends BaseClassOfTest {

	public static void main(String[] args) throws InterruptedException 
	{
		preCondition();
		String expected_title="Demo Web Shop";
		String actual_title=driver.getTitle();
		if(expected_title.equals(actual_title))
		{
			System.out.println("Verification Is Done");
			logIn();
			Actions act = new Actions(driver);
			Thread.sleep(2000);
			act.keyDown(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'$25 Virtual Gift Card')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='giftcard_2_RecipientName']")).sendKeys("mamini");
			Thread.sleep(2000);
			driver.findElement(By.className("recipient-email")).sendKeys("maminiga96@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//textarea[@class='message']")).sendKeys("mobile");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='addtocart_2_EnteredQuantity']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='addtocart_2_EnteredQuantity']")).sendKeys("4");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='add-to-cart-button-2']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
			Thread.sleep(2000);
			WebElement product = driver.findElement(By.xpath("//a[contains(text(),'$25 Virtual Gift Card')]"));
			if(product.isDisplayed()) 
			{
				System.out.println("product is added sucessfully >>> ");
				logOut();
				driver.close();
			}
		}
		else
		{
			System.out.println("Verification Is  not Done");
		}
		postCondition1();
		
		
	}

}
