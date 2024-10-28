package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameUsingLoginModule {

	public static void main(String[] args) throws InterruptedException {
          String expected_result="Demo Web Shop";
          //Open The browser
          ChromeDriver driver=new ChromeDriver();
          //waiting condition
          Thread.sleep(3000);
          //maximize the browser
          driver.manage().window().maximize();
          //waiting Condition
          Thread.sleep(3000);
          driver.get("https://demowebshop.tricentis.com/");
          String actual_result=driver.getTitle();
          if(expected_result.equals(actual_result))
          {
        	  System.out.println("i am in DWS page");
        	  driver.findElement(By.className("ico-login")).click();
          }
          else 
          {
        	  System.out.println("i am in not DWS page");
        	  driver.close();
        	  
          }
          Thread.sleep(3000);
          driver.close();

	}

}
