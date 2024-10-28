package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnTheDisableElementByUsingClickMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		//scrolling up to Web Element
		WebElement jdk = driver.findElement(By.linkText("jdk-8u421-linux-x64.tar.gz"));
		Thread.sleep(2000);
		jdk.click();
		Thread.sleep(2000);
		
		WebElement disable_button = driver.findElement(By.linkText("Download jdk-8u421-linux-x64.tar.gz"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()", disable_button);
		
		
	}

}
