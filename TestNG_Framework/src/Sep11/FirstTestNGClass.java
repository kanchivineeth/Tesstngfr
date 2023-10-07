package Sep11;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Config.Apputil;

public class FirstTestNGClass extends Apputil{
@Test
public void branches()
{
	driver.findElement(By.xpath("(//img)[5]")).click();
	Reporter.log("Executing Branches Test",true);
}
@Test
public void role()
{
	driver.findElement(By.xpath("(//img)[6]")).click();
	Reporter.log("Executing role Test",true);
}
@Test
public void users()
{
	driver.findElement(By.xpath("(//img)[7]")).click();
	Reporter.log("Executing users Test",true);
}
}
