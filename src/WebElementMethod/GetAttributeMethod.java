package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static void main(String[] args) throws InterruptedException {
	  String expected_result="https://demowebshop.tricentis.com/";
	  String data="Mobile";
	  //open the Browser
	  ChromeDriver driver=new ChromeDriver();
	  //maximize the Browser
	  driver.manage().window().maximize();
	  //waiting condition
	  Thread.sleep(3000);
	  //Enter into DWs page
	  driver.navigate().to("https://demowebshop.tricentis.com/");
	  String actual_result=driver.getCurrentUrl();
	  if(expected_result.equals(actual_result))
	  {
		  System.out.println("I am DWS Page");
		  //To find WebElement
		  WebElement search_field = driver.findElement(By.name("q"));
		   String attribute_value = search_field.getAttribute("id");
		  System.out.println(attribute_value);
		  search_field.sendKeys(data);
		 String newData = search_field.getAttribute("value");
		 System.out.println(newData);
		 //for verifying
		 if(data.equals(newData))
		 {
			 System.out.println("Data passed Successfully");
		 }
		 else 
		 {
			 System.out.println("Data Passed Unsucessfully");
			 
		 }
		  
	  }
	  else
	  {
		  System.out.println("I am Not DWS Page");
		  driver.close();
	  }
	  Thread.sleep(3000);
	  driver.close(); 

	}

}
