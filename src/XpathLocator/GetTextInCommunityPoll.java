package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextInCommunityPoll {

	public static void main(String[] args) throws InterruptedException {
		String expected_result="https://demowebshop.tricentis.com/";
		//open the Browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the Browser
		driver.manage().window().maximize();
		//waiting Condition
		Thread.sleep(3000);
		//enter into the DWS page
		driver.get("https://demowebshop.tricentis.com/");
		String actual_result=driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("i am dws page");
			WebElement community_poll = driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/div[2]/div/strong"));
			String data = community_poll.getText();
			System.out.println(data);
		}
		else
		{
			System.out.println(" i am not dws page");
			driver.close();
		}
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
