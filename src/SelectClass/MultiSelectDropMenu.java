package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropMenu {

	public static void main(String[] args) throws InterruptedException {
		// open The browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
		//enter into Web page
		driver.get("file:///C:/Users/lenovo/Downloads/demo.html");
		WebElement multi_Select = driver.findElement(By.id("multiple_cars"));
		Select sel=new Select(multi_Select);
		Thread.sleep(2000);
		sel.selectByVisibleText("Mini");
		Thread.sleep(2000);
		sel.selectByVisibleText("Nissan");
		Thread.sleep(2000);
		sel.selectByValue("bmw");
		Thread.sleep(3000);
		driver.close();
		

	}

}
