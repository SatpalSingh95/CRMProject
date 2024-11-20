package practice.testng;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SasmpleReportTest2 {
	public ExtentReports report;
	
	@BeforeSuite
	public void configBS()
	{

		// SPARK  REPORT CONFIG
		ExtentSparkReporter spark= new ExtentSparkReporter("./AdvanceReport/report.html");
		spark.config().setDocumentTitle("CRM Test Suite Results");
		spark.config().setReportName("CRM Report");
		spark.config().setTheme(Theme.DARK);
		
		// add Env information and create test
		
		 report=new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "Window-11");
		report.setSystemInfo("OS", "Chrome-100");
		
	}
	@AfterSuite
	public void configAS()
	{
		report.flush();
	}

	@Test
	public void createContactTest()
	{
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888");
	
	// EventFiringWebDriver edriver=new EventFiringWebDriver(driver);==> deprecated means may not work in next version.
	
	TakesScreenshot eDriver =(TakesScreenshot)driver;
String filePath=	eDriver.getScreenshotAs(OutputType.BASE64);
		
		ExtentTest test = report.createTest("createContactTest");
		test.log(Status.INFO,"login to app");
	     test.log(Status.INFO,"navigate to contact page");
		test.log(Status.INFO,"create contact");
		if("HF".equals("HDFC"))
		{
			test.log(Status.PASS,"CONTACT IS CREATED ");
			
		}
		else
		{
			test.addScreenCaptureFromBase64String(filePath, "ErrorFile");
			//test.log(Status.FAIL,"contact is not created");
			
		}
		driver.close();
		
	}
	
}
