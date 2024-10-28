package Mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test3 extends BaseClass {

	public static void main(String[] args) throws InterruptedException 
	{
				precondition();
				Thread.sleep(3000);
				WebElement poll = driver.findElement(By.xpath("//strong[text()='Community poll']"));
				if(poll.isDisplayed()) {
					System.out.println("Verification Successful");
					
					login();
					WebElement gift = driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]"));
					gift.click();
					Thread.sleep(1000);
					WebElement button = driver.findElement(By.xpath("(//input[@type='button'])[3]"));
					button.click();
					Thread.sleep(1000);
					WebElement recep_name = driver.findElement(By.xpath("//input[@class='recipient-name']"));
					recep_name.sendKeys("Akki singh");
					WebElement recep_email = driver.findElement(By.xpath("//input[@class='recipient-email']"));
					recep_email.sendKeys("aakanksha1998@gmail.com");
					Thread.sleep(1000);
					WebElement qty = driver.findElement(By.xpath("//input[@class='qty-input']"));
					qty.clear();
					qty.sendKeys("4");
					WebElement add = driver.findElement(By.xpath("//input[@value='Add to cart']"));
					add.click();
					Thread.sleep(2000);
					driver.navigate().back();
					Thread.sleep(1000);
					driver.navigate().back();
					Thread.sleep(1000);
					WebElement cart =  driver.findElement(By.xpath("//a[@class='ico-cart']"));
					cart.click();
					Thread.sleep(1000);
					WebElement img = driver.findElement(By.xpath("//input[@type='checkbox']"));
					if(img.isEnabled()) {
						System.out.println("Verification for Product Quantity Successful");
						
					}
					else {
						System.out.println("Verification for Product Quantity Failed");
						driver.close();
					}
					
					
				}else {
					System.out.println("Verification Failed");
					driver.close();
				}
				logout();
				Thread.sleep(2000);
				postcondition2();
			}

}
