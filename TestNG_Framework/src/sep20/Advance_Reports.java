package sep20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Advance_Reports {
WebDriver driver;
ExtentReports reports;
ExtentTest logger;
@BeforeTest
public void generateReport()
{
	//define path of html
	reports = new ExtentReports("./test-output/Reports/Demo.html");
}
@BeforeMethod
public void setUp()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://google.com");
}
@Test
public void testPass()
{
	//test case starts here
	logger=reports.startTest("pass test case");
	logger.assignAuthor("Ravan");
	logger.assignCategory("functional");
	String Expected_Title="google";
	String Actual_title=driver.getTitle();
	if(Expected_Title.equalsIgnoreCase(Actual_title))
	{
		logger.log(LogStatus.PASS,Expected_Title+"   "+Actual_title+"    "+"Title is matching");
	}
	else
	{
		logger.log(LogStatus.FAIL,Expected_Title+"   "+Actual_title+"   "+"Title is not matching");
	}
}
@Test
public void testfail()
{
	//test case starts here
	logger=reports.startTest("fail test case");
	logger.assignAuthor("Ravan");
	logger.assignCategory("functional");
	String Expected_Title="yahoo";
	String Actual_title=driver.getTitle();
	if(Expected_Title.equalsIgnoreCase(Actual_title))
	{
		logger.log(LogStatus.PASS,Expected_Title+"   "+Actual_title+"    "+"Title is matching");
	}
	else
	{
		logger.log(LogStatus.FAIL,Expected_Title+"   "+Actual_title+"   "+"Title is not matching");
	}
}
@AfterMethod
public void tearDown()
{
	reports.endTest(logger);
	reports.flush();
	driver.quit();
}
}
