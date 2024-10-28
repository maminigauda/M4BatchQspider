package TaskOn5Sepetember;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterDemoSite {

	public static void main(String[] args) throws InterruptedException 
	{
		String expected_result="https://demo.automationtesting.in/Register.html";
		//open the browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(2000);
		//enter into RegisterDemoSite Web Page
		driver.get("https://demo.automationtesting.in/Register.html");
		String actual_result=driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("I Am RegisterDemoSite Web Page.....");
			driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Mamini");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Gauda");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("textarea[ng-model='Adress']")).sendKeys("This Is My RegisterDemoSite");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[type='email']")).sendKeys("maminiga96@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[ng-model='Phone']")).sendKeys("88479905543");
			Thread.sleep(2000);
			WebElement female = driver.findElement(By.cssSelector("input[value='FeMale']"));
			female.click();
			if(female.isSelected())
			{
				System.out.println("female button will get selected");
			}
			else
			{
				System.out.println("female button will get not selected");
			}
			Thread.sleep(2000);
			 WebElement hobby = driver.findElement(By.id("checkbox1"));
			 hobby.click();
			 if(hobby.isSelected())
			 {
				 System.out.println("Hobby is selected");
			 }
			 else
			 {
				 System.out.println("Hobby is not selected");
			 }
			Thread.sleep(2000);
			//LANGUAGE....
			driver.findElement(By.id("")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("")).click();
			//SKILLS........
			Select skillSelect=new Select(driver.findElement(By.id("")));
			skillSelect.selectByVisibleText("");
			Thread.sleep(2000);
			WebElement country = driver.findElement(By.id("countries"));
			Thread.sleep(2000);
			Select sel1=new Select(country);
			Thread.sleep(2000);
			sel1.selectByVisibleText("Select Country");
			WebElement country_sel = driver.findElement(By.id("country"));
			Thread.sleep(2000);
			Select sel2=new Select(country_sel);
			Thread.sleep(2000);
			sel2.selectByVisibleText("India");
			WebElement year = driver.findElement(By.id("yearbox"));
			Thread.sleep(2000);
			Select sel3=new Select(year);
			Thread.sleep(2000);
			sel3.selectByVisibleText("1996");
			WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
			Thread.sleep(2000);
			Select sel4=new Select(month);
			Thread.sleep(2000);
			sel4.selectByVisibleText("January");
			WebElement day = driver.findElement(By.id("daybox"));
			Thread.sleep(2000);
			Select sel5=new Select(day);
			Thread.sleep(2000);
			sel5.selectByValue("20");
			driver.findElement(By.id("firstpassword")).sendKeys("mamini@123");
			Thread.sleep(2000);
			driver.findElement(By.id("secondpassword")).sendKeys("mamini@123");
			Thread.sleep(2000);
			driver.findElement(By.id("submitbtn")).click();
		}
		else
		{
			System.out.println("I Am RegisterDemoSite Web Page.....");
			driver.close();
		}
		Thread.sleep(2000);
		driver.close();
		

	}

}
