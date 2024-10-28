package ActionsClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task3Login {

	public static void main(String[] args) throws InterruptedException 
	{
		String expected_result="https://demowebshop.tricentis.com/";
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.get("https://demowebshop.tricentis.com/");
	    String actual_result=driver.getCurrentUrl();
	    Actions act = new Actions(driver);
	    if(expected_result.equals(actual_result))
	    {
	    	System.out.print("I Am In DWS Page");
	    	act.keyDown(Keys.TAB).build().perform();
		    Thread.sleep(2000);
		    act.keyDown(Keys.TAB).build().perform();
		    Thread.sleep(2000);
		    act.keyDown(Keys.TAB).build().perform();
		    Thread.sleep(2000);
		    act.keyDown(Keys.ENTER).build().perform();
		    
		    act.sendKeys("maminigauda@gmail.com").build().perform();
		    Thread.sleep(2000);
	   	    act.keyDown(Keys.ENTER).build().perform();
		    Thread.sleep(2000);
		    act.keyDown(Keys.TAB).build().perform();
		    Thread.sleep(2000);
            act.sendKeys("mamini@123").build().perform();
		    Thread.sleep(2000);
			act.keyDown(Keys.ENTER).build().perform();
		    Thread.sleep(2000) ;
		    
		    
		    driver.close();
	    }
	    else
	    {
	    	System.out.println("I am Not Dws Page");
	    }
	    Thread.sleep(2000);
	    driver.close();
	   

	}

}
