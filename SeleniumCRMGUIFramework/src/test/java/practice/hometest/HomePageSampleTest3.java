package practice.hometest;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//example of hard and soft
public class HomePageSampleTest3
{
	@Test
	public void homePageTest(Method mtd)
	{
		System.out.println(mtd.getName()+" Test Start");
SoftAssert assertObj=new SoftAssert();
		//String expectedPage="Home";
		String expectedPage="Home Page";
		
		System.out.println("step-1");
		System.out.println("step-2");
		Assert.assertEquals("Home","Home");
		System.out.println("step-3");
		assertObj.assertEquals("Title","Title-1");
		System.out.println("step-4");
		
		// When we use SoftAssert it is mandatory to use asertAll() method at the end of the test method to get exception where the test case got failed.
		assertObj.assertAll();
		
		System.out.println(mtd.getName()+" Test End");
}

@Test
public void verifyLogoHomePage(Method mtd)
{
	System.out.println(mtd.getName()+"Test Start");
	SoftAssert assertObj=new SoftAssert();
	System.out.println("step-1");
	System.out.println("step-2");
	assertObj.assertTrue(true);
	System.out.println("step-3");
	System.out.println("step-4");
	
	assertObj.assertAll();
	System.out.println(mtd.getName()+"Test End");
	
}
}