package TaskOn22August;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		String expected_result="https://www.ajio.com/";
		//open the browser
		ChromeDriver driver=new ChromeDriver();
		//mximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
		//enter into Ajio App
		driver.get("https://www.ajio.com/");
		String actual_result=driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("i am A JIo App HOme Page");
			Thread.sleep(2000);
			 driver.findElement(By.xpath("(//div[@class='searchbar-view'])/div/input")).sendKeys("beauty");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//div[@class='searchbar-view']/button/span")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//strong[text()='The Derma Co']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
			 
			
			
		}
		else
		{
			System.out.println("i am not a JIo App HOme Page");
			driver.close();
		}
		Thread.sleep(2000);
		driver.close();
		

	}

}
