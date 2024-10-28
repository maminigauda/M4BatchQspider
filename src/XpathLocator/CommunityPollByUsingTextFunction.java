package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommunityPollByUsingTextFunction {

	public static void main(String[] args) throws InterruptedException {
		String expected_result="https://demowebshop.tricentis.com/";
		//open the browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
		//enter into Dws page
		driver.get("https://demowebshop.tricentis.com/");
		String actual_result=driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println(" i am DWS page..");
			WebElement poll = driver.findElement(By.xpath("//strong[text()='Community poll']"));
			String data=poll.getText();
			System.out.println(data);
		}
		else
		{
			System.out.println(" i am not DWS page..");
		}
		Thread.sleep(3000);
		driver.close();
		

	}

}
