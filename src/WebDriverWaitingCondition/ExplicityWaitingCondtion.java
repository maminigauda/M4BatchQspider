package WebDriverWaitingCondition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWaitingCondtion {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.shoppersstack.com/");
		//create an object Of WebDriverWait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		//if want to element is clickable or not
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='loginBtn']")));
		//if we Want Element Is visiable or not
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='loginBtn']")));
		driver.findElement(By.xpath("//button[@name='loginBtn']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Create Account']")));
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		
		//driver.close();
		
	}

}
