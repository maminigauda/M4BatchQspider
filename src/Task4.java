import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) throws InterruptedException 
	{
		String expected_result="https://www.shoppersstack.com/";
		// open the browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(30000);
		//enter into shopperStack app
		driver.get("https://www.shoppersstack.com/");
		String actual_result=driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("I am ShopperStack Page....");
			driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		
		}
		else {
			System.out.println("i am not ShopperStack page....");
			driver.close();
		}
		Thread.sleep(2000);
		driver.close();
	}

}
