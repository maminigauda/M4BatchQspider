package Assignment24Sepetember;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		
		WebElement mainframe = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(mainframe);
		
		WebElement login = driver.findElement(By.xpath("(//div[@class='form_container'])[2]/iframe"));
		driver.switchTo().frame(login);
		
		WebElement email = driver.findElement(By.xpath("(//div[@class='form-group'])[1]/iframe"));
		driver.switchTo().frame(email);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Admin@gmail.com");
		driver.switchTo().parentFrame();
		
		WebElement password = driver.findElement(By.xpath("(//div[@class='form-group'])[2]/iframe"));
		driver.switchTo().frame(password);
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@1234");
		driver.switchTo().parentFrame();
		
		WebElement cpassword = driver.findElement(By.xpath("(//div[@class='form-group'])[3]/iframe"));
		driver.switchTo().frame(cpassword);
		
		driver.findElement(By.xpath("//input[@id='confirm']")).sendKeys("Admin@1234");
		driver.switchTo().parentFrame();
		
		WebElement button = driver.findElement(By.xpath("(//div[@class='form-group'])[4]/iframe"));
		driver.switchTo().frame(button);
		
		driver.findElement(By.xpath("//button[@id='submitButton']")).click();
		Thread.sleep(2000);
		
		driver.close();
	}
}


