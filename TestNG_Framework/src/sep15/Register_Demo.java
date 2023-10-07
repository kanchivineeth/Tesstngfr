package sep15;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class Register_Demo {
Properties conpro;
WebDriver driver;
@BeforeTest
public void setUp()throws Throwable
{
	conpro = new Properties();
	//load file
	conpro.load(new FileInputStream("Login.properties"));
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(conpro.getProperty("Url"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@Test
public void startTest() throws Throwable
{
	JavascriptExecutor js =(JavascriptExecutor)driver;
	driver.findElement(By.xpath(conpro.getProperty("ObjMyAccount"))).click();
	driver.findElement(By.xpath(conpro.getProperty("ObjRegister"))).click();
	driver.findElement(By.xpath(conpro.getProperty("Objfname"))).sendKeys(conpro.getProperty("Enterfname"));
	driver.findElement(By.xpath(conpro.getProperty("Objlname"))).sendKeys(conpro.getProperty("Enterlname"));
	driver.findElement(By.xpath(conpro.getProperty("ObjEmail"))).sendKeys(conpro.getProperty("EnterEmail"));
	driver.findElement(By.xpath(conpro.getProperty("Objpassword"))).sendKeys(conpro.getProperty("Enterpass"));
	js.executeScript("window.scrollBy(0,300)");
	js.executeScript("document.querySelector(`#input-newsletter-yes`).click()");
	Thread.sleep(2000);
	js.executeScript("document.querySelector(`input[value=\"1\"][name=\"agree\"]`).click()");
	Thread.sleep(2000);
	js.executeScript("document.querySelector(`button[type=\"submit\"]`).click()");
	
	
}
@AfterTest
public void tearDown() throws Throwable
{
	Thread.sleep(8000);
	driver.quit();
}

}

