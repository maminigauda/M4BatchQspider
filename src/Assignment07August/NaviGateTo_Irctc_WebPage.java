package Assignment07August;

import org.openqa.selenium.chrome.ChromeDriver;

public class NaviGateTo_Irctc_WebPage {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.irctc.co.in/");
		
		driver.close();
		
	}

}
