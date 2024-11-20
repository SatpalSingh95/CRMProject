package practice.hometest;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HomePageSampleTest4
{
	@Test
	public void homePageTest(Method mtd)
	{
		Reporter.log(mtd.getName()+" Test Start");
		
		Reporter.log("step-1",true);
		
		Reporter.log("step-2",true);
		Reporter.log("step-3",true);
		Reporter.log("step-4",true);


		
		
		Reporter.log(mtd.getName()+" Test End");
}

@Test
public void verifyLogoHomePage(Method mtd)
{
	Reporter.log(mtd.getName()+"Test Start");
	Reporter.log("step-1",true);
	Reporter.log("step-2",true);
	
	Reporter.log("step-3",true);
	Reporter.log("step-4",true);
	

	Reporter.log(mtd.getName()+"Test End");
	
}
}