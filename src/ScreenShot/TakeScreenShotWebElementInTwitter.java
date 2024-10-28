package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShotWebElementInTwitter {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//open the browser
		WebDriver driver=new ChromeDriver();
		//maximize the Browser
		driver.manage().window().maximize();
		//waiting condition
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//enter into web page
		driver.get("https://x.com/ALLIARJUN1");
		Thread.sleep(2000);
		WebElement alluArjun = driver.findElement(By.xpath("//div[@aria-label='Opens profile photo']"));
		File from = alluArjun.getScreenshotAs(OutputType.FILE);
		File to = new File("D:\\SeleniumScrhot\\alluArjun.png");
		FileHandler.copy(from, to);
	}

}
