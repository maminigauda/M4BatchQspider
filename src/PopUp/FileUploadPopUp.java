package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		//maximize the Browser
		driver.manage().window().maximize();
		//Waiting Condition
		Thread.sleep(2000);
		//Enter In to WEB Page
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		Thread.sleep(2000);
		WebElement sendFiles = driver.findElement(By.xpath("//input[@type='file']"));
		Thread.sleep(2000);
		sendFiles.sendKeys("C:\\Users\\lenovo\\Desktop\\Selenium\\MY File.docx");
		Thread.sleep(2000);
		driver.close();


	}

}
