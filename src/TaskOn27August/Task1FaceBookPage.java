package TaskOn27August;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1FaceBookPage {

	public static void main(String[] args) throws InterruptedException 
	{
		String expected_result="https://www.facebook.com/";
		//open the Browser
		WebDriver driver=new ChromeDriver();
		//maximize the Browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
		//Enter Into Face Book Web Page
		driver.get("https://www.facebook.com/");
		String actual_result=driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("I Am A Face Book Home Page....");
			WebElement create_account = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
			if(create_account.isEnabled())
			{
				System.out.println("It is  disable ");
				create_account.click();
				Thread.sleep(2000);
				driver.findElement(By.name("firstname")).sendKeys("Damini");
				Thread.sleep(1000);
				driver.findElement(By.name("lastname")).sendKeys("Gauda");
				Thread.sleep(1000);
				driver.findElement(By.name("reg_email__")).sendKeys("damini12@gmail.com");
				Thread.sleep(1000);
				driver.findElement(By.name("reg_passwd__")).sendKeys("damini123");
				Thread.sleep(1000);
				WebElement single_element = driver.findElement(By.id("day"));
				Thread.sleep(1000);
				Select sel=new Select(single_element);
				sel.selectByVisibleText("20");
				Thread.sleep(1000);
				WebElement single_element1 = driver.findElement(By.id("month"));
				Thread.sleep(1000);
				Select sel1=new Select(single_element1);
				sel1.selectByValue("1");
				Thread.sleep(1000);
				WebElement single_element2 = driver.findElement(By.id("year"));
				Thread.sleep(1000);
				Select sel2=new Select(single_element2);
				sel2.selectByValue("1996");
				Thread.sleep(1000);
				driver.findElement(By.className("_58mt")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
				
			}
			else
			{
				System.out.println("It is not disable");
				driver.close();
			}
			
		}
		else
		{
			System.out.println("I Am Not A Face Book Home Page....");
			driver.close();
		}
		Thread.sleep(2000);
		driver.close();
		

	}

}
