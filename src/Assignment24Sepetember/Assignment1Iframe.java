package Assignment24Sepetember;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1Iframe {

	public static void main(String[] args) throws InterruptedException 
	{
		//open the browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//enter into web page
		driver.get("file:///C:/Users/lenovo/Downloads/iframe.html");
		driver.switchTo().frame("FR1");
		String parent = driver.getWindowHandle();
		WebElement poll = driver.findElement(By.xpath("//strong[contains(text(),'Community poll')]"));
		if(poll.isDisplayed())
		{
			System.out.println("Verification is completed");
			
			Actions act = new Actions(driver);
			act.keyDown(Keys.DOWN).perform();
			act.keyDown(Keys.DOWN).perform();
			act.keyDown(Keys.DOWN).perform();
			WebElement fb = driver.findElement(By.xpath("//a[text()='Facebook']"));
			fb.click();
			Set<String> child = driver.getWindowHandles();
			child.remove(parent);
			for (String string : child) {
				driver.switchTo().window(string);
			}
			System.out.println(child);
			
			driver.findElement(By.xpath("//div[@aria-label='Create new account']")).click();
		    //driver.close();
			driver.switchTo().window(parent);
			driver.switchTo().frame("FR1");
				act.keyDown(Keys.UP).perform();
				act.keyDown(Keys.UP).perform();
				act.keyDown(Keys.UP).perform();
				Thread.sleep(2000);
				WebElement search = driver.findElement(By.id("small-searchterms"));
				search.sendKeys("Book");
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.findElement(By.partialLinkText("Google")).click();
		}
		else {
			System.out.println("Not in Dws page");
		}
		Thread.sleep(3000);
		driver.quit();
		}

}
