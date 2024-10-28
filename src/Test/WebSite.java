package Test;

import java.time.Duration;
import java.util.Set;

import org.apache.commons.exec.LogOutputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebSite extends  BaseClassOfTest {

	public static void main(String[] args) throws InterruptedException 
	{
		preCondition();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String expcted_url="https://demowebshop.tricentis.com/";
		String actual_url=driver.getCurrentUrl();
		String parent = driver.getWindowHandle();
		Actions act=new Actions(driver);
		if(expcted_url.equals(actual_url))
		{
			System.out.println("I am Dws Page");
			act.keyDown(Keys.PAGE_DOWN);
			act.keyDown(Keys.PAGE_DOWN);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Facebook']")).click();
			Thread.sleep(2000);
			Set<String> childs = driver.getWindowHandles();
			for (String str : childs) 
			{
				driver.switchTo().window(str);
				
			}
			driver.findElement(By.xpath("//span[text()='Create new account']")).click();
			Thread.sleep(2000);
			Set<String> signup = driver.getWindowHandles();
			for (String str1 : signup) 
			{
				driver.switchTo().window(str1);
				
			}
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mamini");
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Gauda");
			WebElement bDay = driver.findElement(By.id("day"));
			Select sel=new Select(bDay);
			sel.selectByVisibleText("20");
			WebElement bMonth = driver.findElement(By.id("month"));
			Select sel1=new Select(bMonth);
			sel1.selectByVisibleText("Jan");
			WebElement bYear = driver.findElement(By.id("year"));
			Select sel2=new Select(bYear);
			sel2.selectByVisibleText("1996");
			driver.findElement(By.xpath("//label[text()='Female']")).click();
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("maminiga96@gmail.com");
			driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("mamini@123");
			driver.findElement(By.name("websubmit")).click();
			Thread.sleep(1000);
			driver.switchTo().window(parent);
			logOut();
			driver.close();
			}
		else
		{
			System.out.println("I am  Not Dws Page");
		}
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
