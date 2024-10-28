package Assignment24Sepetember;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
						
		WebElement iframe = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Mamini@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Mamini@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys("Mamini@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		Thread.sleep(1000);

		driver.switchTo().parentFrame();
		WebElement iframe2 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
		driver.switchTo().frame(iframe2);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Mamini@gmail.com");
		Thread.sleep(1000);

		driver.findElement(By.id("password")).sendKeys("Mamini@123");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.close();
	}

	

}
