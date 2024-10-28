package TaskOn12Sepetember;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskNumber3 {

	public static void main(String[] args) throws InterruptedException 
	{
		String expected_url="https://www.olivegarden.com/home";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/lenovo/Downloads/MultipleWindow-1.html");
	 WebElement button = driver.findElement(By.xpath("//input[@type='button']"));
		if(button.isEnabled())
		{
			button.click();
		}
		Thread.sleep(5000);
		Set<String> childs = driver.getWindowHandles();
		for (String str : childs) 
		{
			driver.switchTo().window(str);
			Thread.sleep(1000);
			String actual_url = driver.getCurrentUrl();
			if(expected_url.equals(actual_url))
			{
				Thread.sleep(1000);
				driver.manage().window().maximize();
				Thread.sleep(3000);
				driver.manage().window().minimize();
				Thread.sleep(2000);
				driver.close();
			}
			
		}
		Thread.sleep(1000);
		driver.quit();
		
	}

}
