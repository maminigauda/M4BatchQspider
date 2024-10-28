package TaskOn19Sepetember;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoukriWebPageFileUpload {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mamini Gauda");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("maminigauda200196@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mamini@96");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("8658494488");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[@class='main-3']")).click();
		Thread.sleep(2000);
		WebElement uploadResume = driver.findElement(By.xpath("//input[@type='file']"));
		Thread.sleep(2000);
		uploadResume.sendKeys("C:\\Users\\lenovo\\Desktop\\Resume\\Mamini Gauda.pdf");
		Thread.sleep(2000);
		driver.close();
		
	}

}
