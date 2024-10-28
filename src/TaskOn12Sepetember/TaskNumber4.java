package TaskOn12Sepetember;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskNumber4 {

	public static void main(String[] args) throws InterruptedException {
		String expected_result="file:///C:/Users/lenovo/Downloads/MultipleWindow-1.html";
		String bbq="https://www.barbequenation.com/";
		String originalItalian="https://www.giallozafferano.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/lenovo/Downloads/MultipleWindow-1.html");
		String actual_result = driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("Verification SucessFully");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='button']")).click();
			Thread.sleep(5000);
			Set<String> childs = driver.getWindowHandles();
			for (String str : childs) 
			{
				driver.switchTo().window(str);
				String actul_url=driver.getCurrentUrl();
				if(bbq.equals(actul_url))
				{
					Thread.sleep(5000);
					driver.manage().window().maximize();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
					
				}
				else if(originalItalian.equals(actul_url))
				{
					Thread.sleep(2000);
					driver.manage().window().maximize();
					Thread.sleep(2000);
					driver.close();
				}
				
			}
		}
		else
		{
			System.out.println("Verification Not SucessFully");
			driver.close();
		}
		Thread.sleep(2000);
		driver.quit();
		

	}

}
