package practice.pom.repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


 

public class SampleTestWithoutPom 
{
	 public static void main(String[] args) {
		 WebDriver driver = new FirefoxDriver();
			driver.get("http://localhost:8888");
			
			SampleTestWithPom s = PageFactory.initElements(driver, SampleTestWithPom.class);
			
		 WebElement ele1 = driver.findElement(By.name("user_name"));
		 WebElement ele2=	driver.findElement(By.name("user_password"));
		 WebElement ele3=driver.findElement(By.id("submitButton"));	

	
	  
	  ele1.sendKeys("admin"); 
	  ele2.sendKeys("admin");
	  driver.navigate().refresh(); 
	  ele1.sendKeys("admin");
	  ele2.sendKeys("admin"); ele3.click(); 
	  
	  }
  
  
}
 
