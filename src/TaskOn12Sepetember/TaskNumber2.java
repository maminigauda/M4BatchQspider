package TaskOn12Sepetember;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskNumber2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/lenovo/Downloads/MultipleWindow-1.html");
		String parent = driver.getWindowHandle();
		WebElement button = driver.findElement(By.xpath("//input[@type='button']"));
		if(button.isEnabled())
		{
			button.click();
			Thread.sleep(2000);
		}
		Set<String> childs = driver.getWindowHandles();
		childs.remove(parent);
		for (String str : childs) 
		{
			Thread.sleep(2000);
			driver.switchTo().window(str);
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.quit();
		

	}
	
	

}
