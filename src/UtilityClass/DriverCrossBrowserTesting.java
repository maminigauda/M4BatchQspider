package UtilityClass;

public class DriverCrossBrowserTesting extends CrossBrowserTesting {

	public static void main(String[] args) throws InterruptedException 
	{
		preCondtion("firefox");
		Thread.sleep(2000);
		System.out.println("I AM IN DWS PAGE...");
		System.out.println("TEST CASE IS PERFORMING");
		postCondition("close");
		
		
	}

}
