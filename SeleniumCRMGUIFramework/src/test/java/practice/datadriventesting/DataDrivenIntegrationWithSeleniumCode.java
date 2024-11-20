package practice.datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DataDrivenIntegrationWithSeleniumCode 
{
public static void main(String[] args) throws IOException, InterruptedException 
{
	FileInputStream fis = new FileInputStream("D:\\SeleniumBasic\\SeleniumCRMGUIFramework\\testData\\Commondata.properties");			Properties pobj=new Properties();
			pobj.load(fis);
		    
			String BROWSER =pobj.getProperty("browser");
			String URL =pobj.getProperty("url");
			String USERNAME =pobj.getProperty("username");
			String PASSWORD=pobj.getProperty("password");
		   
			WebDriver driver=null;
			if(BROWSER.equals("chrome"))
			{
				driver=new ChromeDriver();
			}
				else if(BROWSER.equals("firefox"))
				{
					driver=new FirefoxDriver();
			     }
				else if(BROWSER.equals("edge"))
				{
					driver=new EdgeDriver();
				}
				else
				{
					driver=new ChromeDriver();
				}
			
			//System.out.println(BROWSER);
			
			
 
			// step 1: Login to app
	//WebDriver driver = new ChromeDriver();
			
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(URL);
	Thread.sleep(2000);
	driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	driver.findElement(By.id("submitButton")).click();
	
	//Thread.sleep(2000);
	
	
	//Navigation to the organization module
	driver.findElement(By.linkText("Organizations")).click();
	
	// Step:3 click on "Create Organization " Button
	
	driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	
	// Step 4 enter all the details and create new Organization
	
	driver.findElement(By.name("accountname")).sendKeys("facebook53");
	Thread.sleep(2000);
	
	driver.findElement(By.name("button")).click();
	Thread.sleep(2000);
	
	// Step :5 logout
	
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).perform();
	
/*	WebElement cl=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click", cl);
	*/
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	
	
driver.quit();

	
	
	
}
}
