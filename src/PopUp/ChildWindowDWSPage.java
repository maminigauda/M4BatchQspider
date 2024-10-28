package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class ChildWindowDWSPage extends CrossBrowserTesting{

	public static void main(String[] args) throws InterruptedException 
	{
		preCondtion("chrome");
		Thread.sleep(2000);
		//for handling the parent window by using getWindowHandle
		String parent = driver.getWindowHandle();
		Actions act=new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		//to find element
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(2000);
		//for handling the child window by using getWindowHandles
		Set<String> childs = driver.getWindowHandles();
		System.out.println("before remove:"+childs);
		//for fetching the data Set<String>
		childs.remove(parent);
		System.out.println("After Remove:"+childs);
		for (String str : childs) 
		{
			//for Switching The Window
			driver.switchTo().window(str);
		}
		System.out.println(childs); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		Thread.sleep(2000);
		postCondition("quit");
		
		}

}
