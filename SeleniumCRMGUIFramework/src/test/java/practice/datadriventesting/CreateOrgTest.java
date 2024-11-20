package practice.datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateOrgTest 
{
public static void main(String[] args) throws IOException, InterruptedException 
{

 
	// step1 : get the java representation object of the physical file
	FileInputStream fis = new FileInputStream("D:\\SeleniumBasic\\SeleniumCRMGUIFramework\\testData\\Commondata.properties");
			
			// step 2  using properties class, load all the keys
			
			Properties pobj=new Properties();
			pobj.load(fis);
		
			//step:3 Read the Data using getProperty method
			String BROWSER =pobj.getProperty("browser");
			String URL =pobj.getProperty("url");
			String USERNAME =pobj.getProperty("username");
			String PASSWORD=pobj.getProperty("password");
			
			//System.out.println(BROWSER);
		//	System.out.println(URL);
 
	WebDriver driver = new FirefoxDriver();
	driver.get(URL);
	
	driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	driver.findElement(By.id("submitButton")).click();
	
	//Thread.sleep(2000);
	driver.findElement(By.linkText("Organizations")).click();
	driver.quit();

	
	
	
}
}
