package TaskOn27August;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task3QspiderDemoShop {

	public static void main(String[] args) throws InterruptedException 
	{
		String expected_result="https://demoapps.qspiders.com/";
		// Open the Browser
		WebDriver  driver=new ChromeDriver();
		//maximize the Browser
		driver.manage().window().maximize();
		//waiting Condition
		Thread.sleep(3000);
		//Enter into QSpider Demo Shop Page
		driver.get("https://demoapps.qspiders.com/");
		//to verify page By using Url
		String actual_result=driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("I AM QSPIDER DEMO SHOP WEB PAGE....");
			driver.findElement(By.xpath("//p[contains(text(),'UI Testing Concepts')]")).click();
			Thread.sleep(3000);
		    driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[5]")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8845768633");
		    Thread.sleep(3000);
		   WebElement mobile = driver.findElement(By.xpath("//select[@id='select1']"));
		   Thread.sleep(2000);
		   Select sel_mobile=new Select(mobile);
		   sel_mobile.selectByIndex(0);
		   WebElement gender = driver.findElement(By.id("select2"));
		   Thread.sleep(2000);
		   Select sel_gender=new Select(gender);
		   sel_gender.selectByValue("female");
		   WebElement country = driver.findElement(By.id("select3"));
		   Thread.sleep(2000);
		   Select sel_country=new Select(country);
		   sel_country.selectByVisibleText("India");
		   WebElement state = driver.findElement(By.id("select5"));
		   Thread.sleep(2000);
		   Select sel_state=new Select(state);
		   sel_state.selectByVisibleText("Maharashtra");
		   WebElement city = driver.findElement(By.xpath("(//div[@class='relative w-full mb-3'])[5]/label"));
		   Thread.sleep(2000);
		   Select sel_city=new Select(city);
		   sel_city.selectByValue("Mumbai City");
		   
		  
		    
			
		}
		else
		{
			System.out.println("I AM  NOT QSPIDER DEMO SHOP WEB PAGE....");
			driver.close();
		}
		Thread.sleep(2000);
		driver.close(); 

	}

}
