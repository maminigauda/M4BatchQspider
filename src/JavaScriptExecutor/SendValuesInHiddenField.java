package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendValuesInHiddenField {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		WebElement hidden = driver.findElement(By.id("custom_gender"));
		js.executeScript("arguments[0].value='Gender'", hidden);
		
		
	}

}
