package Assignment21Sepetember;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1OmoyoBlogSpotWebSite {

	public static void main(String[] args) throws InterruptedException {
		String expected_url="https://omayo.blogspot.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		String actual_url=driver.getCurrentUrl();
		
		if(expected_url.equals(actual_url))
		{
			System.out.println("Verification Is completed");
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
			Thread.sleep(2000);
			Actions act=new Actions(driver);
			act.keyDown(Keys.PAGE_DOWN).build().perform();
			act.keyDown(Keys.PAGE_DOWN).build().perform();
			driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
			driver.findElement(By.xpath("//a[text()='Facebook']")).click();
			driver.navigate().back();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='timerButton']"))).click();
			Alert alt=driver.switchTo().alert();
			System.out.println("PopUp Text :" + alt.getText());
			alt.accept();
			
		}
		else
		{
			System.out.println("Verification Is Not completed");
			driver.close();
		}
		//driver.quit();
		
	}

}
