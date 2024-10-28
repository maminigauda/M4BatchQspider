package Mock;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Task1 extends BaseClass {


			public static void main(String[] args) throws InterruptedException {
				precondition();
				String expected_url = "https://demowebshop.tricentis.com/";
				String actual_url = driver.getCurrentUrl();
				String parent = driver.getWindowHandle();
				Actions act = new Actions(driver);
				if(expected_url.equals(actual_url)) {
					System.out.println("In DWS Page");
					login();
					act.keyDown(Keys.PAGE_DOWN).build().perform();
					Thread.sleep(2000);
					act.keyDown(Keys.PAGE_DOWN).build().perform();
					Thread.sleep(2000);
					driver.findElement(By.linkText("Facebook")).click();
					Thread.sleep(2000);
					
					Set<String> childs = driver.getWindowHandles();
					for (String str : childs) 
					{
						driver.switchTo().window(str);
						
					}
					driver.findElement(By.xpath("//span[text()='Create new account']")).click();
					Thread.sleep(2000);
					Set<String> childs2 = driver.getWindowHandles();
					for (String str1 : childs2) {
						driver.switchTo().window(str1);
					}
				driver.findElement(By.name("firstname")).sendKeys("Mamini");
				driver.findElement(By.name("lastname")).sendKeys("Gauda");
				WebElement single_Select = driver.findElement(By.id("day"));
				Thread.sleep(1000);
				Select sel = new Select(single_Select);
				sel.selectByVisibleText("20");
				Thread.sleep(1000);
				WebElement single_Select2 = driver.findElement(By.id("month"));
				Thread.sleep(1000);
				Select sel2 = new Select(single_Select2);
				sel2.selectByIndex(0);
				Thread.sleep(1000);
				WebElement single_Select3 = driver.findElement(By.id("year"));
				Select sel3 = new Select(single_Select3);
				sel3.selectByValue("1996");
				Thread.sleep(1000);
				driver.findElement(By.className("_58mt")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("reg_email__")).sendKeys("maminigauda96@gmail.com");
				driver.findElement(By.name("reg_passwd__")).sendKeys("Mamini@123");
//				driver.findElement(By.name("websubmit")).click();
//				Thread.sleep(1000);
				System.out.println("Again in Dws Page");
				driver.switchTo().window(parent);
				logout();
				postcondition2();
				}
				

	}

}
