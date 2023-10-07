package Sep11;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Config.Apputil2;

public class ThirdtestNGClass extends Apputil2{
	@Test
	public void pbanking()
	{
		driver.findElement(By.xpath("(//img)[4]")).click();
	}
	@Test
	public void cbanking()
	{
		driver.findElement(By.xpath("(//img)[5]")).click();
	}
	@Test
	public void ibanking()
	{
		driver.findElement(By.xpath("(//img)[6]")).click();
	}
}
