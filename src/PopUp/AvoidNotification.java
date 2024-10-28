package PopUp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AvoidNotification {

	public static void main(String[] args) throws InterruptedException {
				//create a Object of ChrpmeOptions
				ChromeOptions options=new ChromeOptions();
				//avoid all notification PopUp
				options.addArguments("disable-notifications");
				//To pass Argument in ChromeDriver
				ChromeDriver driver=new ChromeDriver(options);
				//maximize the browser
				driver.manage().window().maximize();
				//waiting condition
				Thread.sleep(2000);
				//enter into web page
				driver.get("https://www.easemytrip.com/");
				Thread.sleep(2000);
				//close the browser
				driver.close();

	}

}
