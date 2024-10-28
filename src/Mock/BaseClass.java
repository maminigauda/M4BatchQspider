package Mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static void precondition() throws InterruptedException  {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://demowebshop.tricentis.com/");
	}
	public static void login() throws InterruptedException {

		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("maminigauda96@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Mamini@123");
		driver.findElement(By.name("RememberMe")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		System.out.println("LOGIN SUSSEFULL");
	}
	public static void logout() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		System.out.println("LOGOUT SUSSEFULL");
	}
	public static void postcondition1() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	public static void postcondition2() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
}
