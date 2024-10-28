package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClassOfTest 
{
	public static WebDriver driver;
	public static void preCondition()
	{
		//open the browser
		driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//enter into particular web page
		driver.get("https://demowebshop.tricentis.com/");
	}
	public static void logIn() throws InterruptedException
	{
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("maminiga96@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("mamini@123");
		driver.findElement(By.name("RememberMe")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		System.out.println("LOGIN SUSSEFULL");
	}
	public static void logOut() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.className("ico-logout")).click();
		System.out.println("LOGOUT SUSSEFULL");

	}
	public static void preCondition1()
	{
		//open the fire fox Browser
		driver=new FirefoxDriver();
		//maximize the Browser
		driver.manage().window().maximize();
		//enter into particular web page
		driver.get("https://demowebshop.tricentis.com/");
	}
	public static void preCondition2() 
	{
		//open edge Driver Browser
		driver=new EdgeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//enter into particular web page
		driver.get("https://demowebshop.tricentis.com/");
		
	}
	public static void postCondition()
	{
		driver.close();
		System.out.println("Thank You Comes Again");
	}
	public static void  postCondition1()
	{
		driver.quit();
		System.out.println("Thank You Comes Again");
	}

}
