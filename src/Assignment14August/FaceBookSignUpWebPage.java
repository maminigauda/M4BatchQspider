package Assignment14August;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookSignUpWebPage {

	public static void main(String[] args) throws InterruptedException {
		String expected_result="https://www.facebook.com/";
		String expected_result1="Facebook – log in or sign up";
		//open the Browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
		//enter into the facebook page
		driver.get("https://www.facebook.com/");
		String actual_result=driver.getCurrentUrl();
		//input[placeholder='First name']
		if(expected_result.equals(actual_result))
		{
			System.out.println("I am face book landing page....");
			driver.findElement(By.cssSelector("a[rel='async']")).click();
			String actual_result1=driver.getTitle();
			if(expected_result1.equals(actual_result1))
			{
				System.out.println("i am sign up page");
				Thread.sleep(3000);
				driver.findElement(By.name("firstname")).sendKeys("Mamini");
				Thread.sleep(3000);
				driver.findElement(By.name("lastname")).sendKeys("Gauda");
				Thread.sleep(3000);
				driver.findElement(By.name("reg_email__")).sendKeys("mamini123@gmail.com");
				Thread.sleep(3000);
				driver.findElement(By.id("password_step_input")).sendKeys("Mamini@123");
				Thread.sleep(3000);
				driver.findElement(By.name("sex")).click();
				Thread.sleep(3000);
				driver.findElement(By.name("websubmit")).click();
				
			}
			else
			{
				System.out.println("i am not sign up page");
			}
		}
		else
		{
			System.out.println("I am not face book Landing page...");
		
			driver.close();
		}
		Thread.sleep(3000);
		driver.close();

	}

}
