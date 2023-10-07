package sep14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {
	WebDriver driver;
	@Test
	public void startTest()
	{
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		String Expected ="google";
		String Actual =driver.getTitle();
		try {
		Assert.assertFalse(Actual.equalsIgnoreCase(Expected), "Title is Matching");
		}catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
			
		driver.quit();
	}
}
