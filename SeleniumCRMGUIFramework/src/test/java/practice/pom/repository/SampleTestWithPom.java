package practice.pom.repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
/*
public class SampleTestWithPom 
{

	
	@FindBy(name="user_name")
	WebElement ele1;
	
	@FindBy(name="user_password")
	WebElement ele2;
	
	@FindBy(id="submitButton")
	WebElement ele3;
	
	@Test
	
	public void sampleTest()
	{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://localhost:8888");
	// this will load all the elements in this class and by taking help of this object i am taking latest address of the Element.
	SampleTestWithPom s = PageFactory.initElements(driver, SampleTestWithPom.class);
		
	s.ele1.sendKeys("admin");
	s.ele2.sendKeys("admin");
	driver.navigate().refresh();
	s.ele1.sendKeys("admin");
	s.ele2.sendKeys("admin");
	s.ele3.click();
}
}

*/

// Auto Healing


public class SampleTestWithPom 
{

	
	@FindBy(name="user_name")
	WebElement ele1;
	
	@FindBy(name="user_password")
	WebElement ele2;
	
	@FindAll({ @FindBy(id="submitButton"),@FindBy(xpath="//input[@value='Login']") })
	WebElement ele3;
	
	@Test
	
	public void sampleTest()
	{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://localhost:8888");
	// this will load all the elements in this class and by taking help of this object i am taking latest address of the Element.
	SampleTestWithPom s = PageFactory.initElements(driver, SampleTestWithPom.class);
		
	s.ele1.sendKeys("admin");
	s.ele2.sendKeys("admin");
	
	s.ele3.click();
}
}
