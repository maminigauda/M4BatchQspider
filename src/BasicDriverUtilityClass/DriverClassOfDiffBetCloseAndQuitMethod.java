package BasicDriverUtilityClass;

import java.util.List;

import org.checkerframework.framework.qual.PreconditionAnnotation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BasicUtilityClass.DifferenceBetCloseAndQuitMethod;

public class DriverClassOfDiffBetCloseAndQuitMethod extends DifferenceBetCloseAndQuitMethod {

	public static void main(String[] args) throws InterruptedException   
	{
		String expected_result="https://demowebshop.tricentis.com/";
		String expected_result1="https://demowebshop.tricentis.com/news/rss/1";
		preCondition();
		String actual_result=driver.getCurrentUrl();
		System.out.println(actual_result);
		if(expected_result.equals(actual_result))
		{
			System.out.println("i am dws page...");
			List<WebElement> web_link = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
			for (WebElement web : web_link) 
			{
				web.click();
				String actual_result1=driver.getCurrentUrl();
				Thread.sleep(2000);
				if(expected_result1.equals(actual_result1))
				{
					driver.navigate().back();
				}
			}
		}
		else
		{
			System.out.println("i am not dws page...");
			postCondition1();
		}
		postCondition1();
		

	}



}
