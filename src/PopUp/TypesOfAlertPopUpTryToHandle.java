package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypesOfAlertPopUpTryToHandle  {

	public static void main(String[] args) throws InterruptedException
	{
		String expected_result="https://demo.automationtesting.in/Alerts.html";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//waiting Condition
		Thread.sleep(2000);
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		String actual_result = driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("i am AutoMation Demo Site...");
			//find Element
			System.out.println("Alert With 'Ok' ");
			driver.findElement(By.xpath("//a[contains(text(),'Alert with OK ')]")).click();	
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("button[onclick='alertbox()']")).click();
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
			System.out.println("Alert With 'Ok' And 'Cancel'");
			driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')] ")).click();
			Thread.sleep(2000);
			Alert alert = driver.switchTo().alert();
			alert.accept();
			Thread.sleep(2000);
			System.out.println("Alert With Text box");
			driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]")).click();
			Alert alertText = driver.switchTo().alert();
			alertText.sendKeys("Mamini");
			Thread.sleep(2000);
			//alertText.accept();
			alertText.dismiss();
		}
		else
		{
			System.out.println("i am not AutoMation Demo Site...");
		}
				
		

	}

}
