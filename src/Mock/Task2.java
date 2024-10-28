package Mock;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task2 extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		precondition();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String expectedtitle = "Demo Web Shop";
		String rssurl = "https://demowebshop.tricentis.com/news/rss/1";
		if(expectedtitle.equals(driver.getTitle())) {
			System.out.println("You are in dws");
			login();
			//driver.findElement(By.id("small-searchterms")).click();
			ChromeOptions option=new ChromeOptions();
			
			driver.findElement(By.xpath("//input[@value='Search']")).click();
			driver.switchTo().alert().accept();
			//option.addArguments("disable-notifications");
			String parent = driver.getWindowHandle();
			System.out.println(parent);
			List<WebElement> followus = driver.findElements(By.xpath("//a[@target='_blank']"));
			for(WebElement ele:followus) {
				ele.click();
				String actualurl = driver.getCurrentUrl();
				
			}
			driver.switchTo().window(parent);
			driver.findElement(By.linkText("RSS")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Set<String> child = driver.getWindowHandles();
			System.out.println(child);
			Set<String> twitter = driver.getWindowHandles();
			System.out.println(twitter);
			for(String twt:twitter) {
			driver.switchTo().window(twt);
			//driver.findElement(By.xpath("//span[text()='Create account']")).click();	
			}
			driver.close();
			Thread.sleep(5000);
			driver.switchTo().window(parent);
			logout();
			driver.quit();			
		}
		else
		{
			System.out.println("Not in dws");
		}
	}
}

