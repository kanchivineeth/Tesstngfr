package Sep11;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Config.AppUtil1;

public class SecondTestNGClass extends AppUtil1{
@Test(description = "Validate Division test",priority = 2,enabled = true)
public void addition()
{
	driver.findElement(By.name("display")).sendKeys("5556");
	driver.findElement(By.xpath("(//input[@id='btn'][6]")).click();
	driver.findElement(By.name("display")).sendKeys("4575");
	driver.findElement(By.xpath("(//input[@id='btn'][20]")).click();
	String addres = driver.findElement(By.name("display")).getAttribute("value");
	Reporter.log(addres+"   "+"Executing Addtion Test",true);
}
@Test(description = "Validate Division test",priority = 0,enabled = true,invocationCount = 5)
public void division()
{
	driver.findElement(By.name("display")).sendKeys("548");
	driver.findElement(By.xpath("(//input[@id='btn'][21]")).click();
	driver.findElement(By.name("display")).sendKeys("546");
	driver.findElement(By.xpath("(//input[@id='btn'][20]")).click();
	String divres = driver.findElement(By.name("display")).getAttribute("value");
	Reporter.log(divres+"   "+"Executing Division Test",true);
}
@Test(description = "Validate Division test",priority = 1,enabled = false)
public void multiplication()
{
	driver.findElement(By.name("display")).sendKeys("5426");
	driver.findElement(By.xpath("(//input[@id='btn'][16]")).click();
	driver.findElement(By.name("display")).sendKeys("57");
	driver.findElement(By.xpath("(//input[@id='btn'][20]")).click();
	String addres = driver.findElement(By.name("display")).getAttribute("value");
	Reporter.log(addres+"   "+"Executing Addtion Test",true);
}
}
