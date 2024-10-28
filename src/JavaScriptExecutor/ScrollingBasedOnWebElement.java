package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingBasedOnWebElement {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.get("https://www.redbus.in/");
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 //find the webElement
		 WebElement book_train = driver.findElement(By.linkText("Book Train Tickets"));
		 //webElement present in little bit top
		 //js.executeScript("arguments[0].scrollIntoView(true);", book_train);
		 //webElement present in bottom
		 js.executeScript("arguments[0].scrollIntoView(false);", book_train);
	}

}
