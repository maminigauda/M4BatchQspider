package Assignment09August;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookApplication {

	public static void main(String[] args) throws InterruptedException {
		
		String expected_result="Facebook – log in or sign up";
		//Open The Browser
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		//maximize the Browser
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//Enter into facebook web page
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		String actual_result=driver.getTitle();
		if(expected_result.equals(actual_result))
		{
			System.out.println("I Am In FaceBook Page");
			driver.findElement(By.id("email")).sendKeys("mamini@gmail.com");
			driver.findElement(By.name("pass")).sendKeys("mamini123");
			driver.findElement(By.name("login")).click();
		}
		else {
			System.out.println("I Am Not In FaceBook Page");
			driver.close();
		}
		Thread.sleep(3000);
		driver.close();
		

	}

}
