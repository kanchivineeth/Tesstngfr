package Config;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Apputil {
 public static WebDriver driver;
 @BeforeTest
 public static void setup()
 {
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://primusbank.qedgetech.com/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.findElement(By.name("txtuId")).sendKeys("Admin");
	 driver.findElement(By.name("txtPword")).sendKeys("Admin");
	 driver.findElement(By.name("login")).click();
	 Reporter.log("Running precondition",true);
 }
 @AfterTest
 public static void tearDown()
 {
	 driver.quit();
	 Reporter.log("Running postcondition",true);
 }
}
