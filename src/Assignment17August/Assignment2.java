package Assignment17August;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		String expected_result="Demo Web Shop";
		// open the Browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the Browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
		//enter into DWS page
		driver.get("https://demowebshop.tricentis.com/");
		String actual_result=driver.getTitle();
		if(expected_result.equals(actual_result))
		{
			System.out.println("I Am DWS page");
			driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[5]/a")).click();
			List<WebElement> addtoCart = driver.findElements(By.xpath("//input[@value='Add to cart']"));
			for (int i = 0; i < addtoCart.size(); i++) {
				addtoCart.get(i).click();
				Thread.sleep(2000);
			}
			driver.findElement(By.className("cart-label")).click();
			List<WebElement> removed = driver.findElements(By.xpath("//input[@name='removefromcart']"));
			for (int i = 0; i < removed.size(); i++) {
				removed.get(i).click();
				}
			driver.findElement(By.cssSelector("input[name='updatecart']")).click();
		}
		else 
		{
			System.out.println("I Am Not DWS apge");
			driver.close();
		}
		Thread.sleep(2000);
		driver.close();

	}

}
