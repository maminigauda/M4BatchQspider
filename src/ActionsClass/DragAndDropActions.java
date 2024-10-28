package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActions {

	public static void main(String[] args) throws InterruptedException 
	{
		String expected_result="http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";
		// open The browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(2000);
		//enter into dhtmlgoodies
		driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		String actual_result=driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("i am DHTNL page...");
			Actions act=new Actions(driver);
			Thread.sleep(2000);
			WebElement source = driver.findElement(By.id("box6"));
			WebElement traget = driver.findElement(By.id("box106"));
			act.dragAndDrop(source, traget).build().perform();
			Thread.sleep(2000);
			WebElement source_madrid = driver.findElement(By.id("box7"));
			WebElement target_madrid = driver.findElement(By.id("box107"));
			act.dragAndDrop(source_madrid, target_madrid).build().perform();
			Thread.sleep(2000);
			WebElement source_norway = driver.findElement(By.id("box1"));
			WebElement target_norway = driver.findElement(By.id("box101"));
			act.dragAndDrop(source_norway, target_norway).build().perform();
			Thread.sleep(2000);
			WebElement source_denmark = driver.findElement(By.id("box4"));
			WebElement target_denmark = driver.findElement(By.id("box104"));
			act.dragAndDrop(source_denmark, target_denmark).build().perform();
			Thread.sleep(2000);
			WebElement source_southkorea = driver.findElement(By.id("box5"));
			WebElement target_southkorea = driver.findElement(By.id("box105"));
			act.dragAndDrop(source_southkorea, target_southkorea).build().perform();
			Thread.sleep(2000);
			WebElement source_sweden = driver.findElement(By.id("box2"));
			WebElement target_sweden = driver.findElement(By.id("box102"));
			act.dragAndDrop(source_sweden, target_sweden).build().perform();
			Thread.sleep(2000);
			WebElement source_unitedState = driver.findElement(By.id("box3"));
			WebElement target_unitedState = driver.findElement(By.id("box103"));
			act.dragAndDrop(source_unitedState, target_unitedState).build().perform();
			
		}
		else
		{
			System.out.println("i am not DHTNL page...");
			driver.close();
		}
		Thread.sleep(2000);
		driver.close();
		

	}

}
