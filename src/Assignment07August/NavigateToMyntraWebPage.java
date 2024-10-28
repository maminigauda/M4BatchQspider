package Assignment07August;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToMyntraWebPage {

	public static void main(String[] args) {
        
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.myntra.com/");
		
		driver.close();
		
	}

}
