package Assignment28August;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoWebShopDropDownMenu {


	public static void main(String[] args) throws InterruptedException 
	{
		String expexted_title="Demo Web Shop";
		//open The browser
		WebDriver driver=new ChromeDriver();
		//open the Browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
		//enter into DWS page
		driver.get("https://demowebshop.tricentis.com/");
		String actual_title=driver.getTitle();
		
		if(expexted_title.equals(actual_title))
		{
			System.out.println("I AM DWS WEB PAGE....");
			driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
			Thread.sleep(2000);
			//Task1
			WebElement sort_by = driver.findElement(By.id("products-orderby"));
			Thread.sleep(2000);
			Select sel=new Select(sort_by);
			List<WebElement> sel_sortby = sel.getOptions();
			int i=0;
			for (WebElement web: sel_sortby) 
			{
				sel.selectByIndex(i++);
				Thread.sleep(2000);
				sort_by = driver.findElement(By.id("products-orderby"));
				sel=new Select(sort_by);
				Thread.sleep(2000);
			}
			//Task2
			
			WebElement display = driver.findElement(By.id("products-pagesize"));
			Thread.sleep(2000);
			Select sel1=new Select(display);
			List<WebElement> display_product = sel1.getOptions();
			int j=0;
			for (WebElement web : display_product) 
			{
				sel1.selectByIndex(j++);
				display = driver.findElement(By.id("products-pagesize"));
				sel1=new Select(display);
				Thread.sleep(2000);
			}
			//Task3
			WebElement view_as = driver.findElement(By.id("products-viewmode"));
			Thread.sleep(2000);
			Select sel2=new Select(view_as);
			List<WebElement> viewas_Product = sel2.getOptions();
			int k=0;
			for (WebElement web : viewas_Product) 
			{
				sel2.selectByIndex(k++);
				view_as = driver.findElement(By.id("products-viewmode"));
				sel2=new Select(view_as);
				Thread.sleep(2000);
			}
			
		}
		else
		{
			System.out.println("I AM NOT DWS WEB PAGE....");
			driver.close();
		}
		Thread.sleep(2000);
		driver.close();

	}

}
