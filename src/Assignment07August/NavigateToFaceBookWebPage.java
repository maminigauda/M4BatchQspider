package Assignment07August;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToFaceBookWebPage {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.close();
	}

}
