package Config;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Apputil2 {
	public static WebDriver driver;
@BeforeSuite
public static void setUp()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://primusbank.qedgetech.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@AfterSuite
public static void tearDown()
{
	driver.quit();
}

}
