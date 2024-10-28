package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClickOnDepatureDate25SeptToReturnDate25JanCalenderPopUp {

	public static void main(String[] args) throws InterruptedException {
		String expected_url="https://www.easemytrip.com/";
		ChromeOptions option=new ChromeOptions();
		option.addArguments("disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(2000);
		//enter into Ease My Trip Web Page
		driver.get("https://www.easemytrip.com/");
		String actual_url=driver.getCurrentUrl();
		if(expected_url.equals(actual_url))
		{
			System.out.println("verification Is Completed");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='ddate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("25/09/2024")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("divRtnCal")).click();
			Thread.sleep(2000);
			//by using Hard Code
//			for(int i=0;i<3;i++)
//			{
//				driver.findElement(By.xpath("//img[@id='img2Nex']")).click();
//			}
//			Thread.sleep(2000);
//			driver.findElement(By.id("frth_6_25/01/2025")).click();
			//without Using Hard Code As a good Test Engineer We Should Follow The THis Process
			for (; ;) 
			{
				try {
					driver.findElement(By.id("fiv_0_25/01/2026")).click();
					break;
					
				}
				catch(Exception e)
				{
					driver.findElement(By.xpath("//img[@id='img2Nex']")).click();
					Thread.sleep(1000);
				}
				
			}
		}
		else
		{
			System.out.println("verification Is Completed");
			driver.close();
		}
		Thread.sleep(2000);
		driver.close();
	}

}
