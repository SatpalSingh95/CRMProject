package practice.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SasmpleReportTest0 
{
	
     @Test
	public void createContactTest()
	{
		// SPARK  REPORT CONFIG
	ExtentSparkReporter spark= new ExtentSparkReporter("./AdvanceReport/report.html");
	spark.config().setDocumentTitle("CRM Test Suite Results");
	spark.config().setReportName("CRM Report");
	spark.config().setTheme(Theme.DARK);
	
	// add Env information and create test
	
	ExtentReports report=new ExtentReports();
	report.attachReporter(spark);
	report.setSystemInfo("OS", "Window-11");
	report.setSystemInfo("OS", "Chrome-100");
		

	ExtentTest test = report.createTest("createContactTest");
	
	
	     test.log(Status.INFO,"login to app");
	     test.log(Status.INFO,"navigate to contact page");
		test.log(Status.INFO,"create contact");
		if("HDFC".equals("HDFC"))
		{
			test.log(Status.PASS,"CONTACT IS CREATED ");
			
		}
		else
		{
			test.log(Status.FAIL,"contact is not created");
		}
		
		// don't forget to backup of this log. if you dont use this method reports will not be saved.whatever the reports u have written logs will not be saved.
		report.flush();
		
	}
	

}