package practice.hometest;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePageVerificationTest0 
{
@Test
public void homePageTest(Method mtd)
{
	// we also capture the name dynamically in order to do that so there is on class method it is coming from java.reflect package
	// to capture the method name what i do  instead of hard coding there is a method called getName()i can use this Method class to capture 
	// the name of the method.
	
	System.out.println(mtd.getName()+" Test Start");

	//String expectedPage="Home";
	String expectedPage="Home Page";

	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://localhost:8888");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	
	String actTitle=driver.findElement(By.xpath("//a[contains(text(),'Home')]")).getText();
	if(actTitle.trim().equals(expectedPage))
	{
		System.out.println(expectedPage+"Page is verified==PASS");
	}
	else
	{
		System.out.println(expectedPage+"Page is not verified==Fail");
	}
	driver.quit();
	System.out.println(mtd.getName()+" Test End");
}
@Test
public void verifyLogoHomePage(Method mtd)
{
	System.out.println(mtd.getName()+"Test Start");

	
	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://localhost:8888");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();	
	
	boolean status=driver.findElement(By.xpath("//img[@title='vtiger-crm-logo.gif']")).isEnabled();
	if(status)
	{
		System.out.println("Logo is verified==PASS");
	}
	else
	{
		System.out.println("Logo is not verified==Fail");
	}
	driver.quit();
	System.out.println(mtd.getName()+"Test End");
	
}
}
