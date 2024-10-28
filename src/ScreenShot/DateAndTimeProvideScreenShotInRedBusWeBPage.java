package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DateAndTimeProvideScreenShotInRedBusWeBPage {

	public static void main(String[] args) throws InterruptedException, IOException {
		LocalDateTime date=LocalDateTime.now();
		String data=date.toString().replace(":", "-");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.redbus.in/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("D:\\SeleniumScrhot\\redBus"+data+".png");
		FileHandler.copy(from, to);
		
		
	}

}
