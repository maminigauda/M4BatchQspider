package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsFunction {

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		ChromeDriver driver=new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
		//enter into the DWS page
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
		
	}

}
