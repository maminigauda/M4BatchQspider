package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		String expected_result="https://demowebshop.tricentis.com/";
		//open the browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
		//enter into DWS page
		driver.navigate().to("https://demowebshop.tricentis.com/");
		String actual_result=driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("i am DWs page");
			//to fInd WebElement
			WebElement excellent = driver.findElement(By.id("pollanswers-1"));
			excellent.click();
			if(excellent.isSelected())
			{
				System.out.println("Element Is Selected");
			}
			else 
			{
				System.out.println("Element Is Selected");
				driver.close();
				
			}
			
		}
		else
		{
			System.out.println("i am not DWs page");
			driver.close();
		}
		Thread.sleep(2000);
		driver.close();

	}

}
