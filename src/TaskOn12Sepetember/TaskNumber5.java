package TaskOn12Sepetember;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskNumber5 {

	public static void main(String[] args) throws InterruptedException 
	{
		String expected_result="Multiple popups";
		String bbq="https://www.barbequenation.com/";
		String olive="https://www.olivegarden.com/home";
		String originalItalian="https://www.giallozafferano.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/lenovo/Downloads/MultipleWindow-1.html");
		String parent = driver.getWindowHandle();
		String actual_result=driver.getTitle();
		if(expected_result.equals(actual_result))
		{
			System.out.println("Verification Sucessfully");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='button']")).click();
			Thread.sleep(2000);
			Set<String> childs = driver.getWindowHandles();
			childs.remove(parent);
			System.out.println(childs);
			for (String str : childs) 
			{
				
				driver.switchTo().window(str);
				Thread.sleep(2000);
				driver.close();
				Thread.sleep(1000);
			}
			
		}
		else
		{
			System.out.println("Verification not Sucessfully");
			driver.close();
		}
		Thread.sleep(2000);
		driver.quit();
		
	}

}
