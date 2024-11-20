package practice.datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateOrgTest2 
{
public static void main(String[] args) throws IOException, InterruptedException 
{

 
	// step1 : get the java representation object of the physical file
	FileInputStream fis = new FileInputStream("D:\\SeleniumBasic\\SeleniumCRMGUIFramework\\testData\\Commondata.properties");
			
			
			// step 2  using properties class, load all the keys
			
			Properties pobj=new Properties();
			pobj.load(fis);
		
			
			String BROWSER =pobj.getProperty("browser");
			String URL =pobj.getProperty("url");
			String USERNAME =pobj.getProperty("username");
			String PASSWORD=pobj.getProperty("password");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Browser");
			
			String browser=sc.next();
			WebDriver driver=null;
			
			if(browser.equals("chrome"))
			{
				
				driver=new ChromeDriver();
				
			}
				else if(browser.equals("firefox"))
				{
					driver=new FirefoxDriver();
			}
				else if(browser.equals("edge"))
				{
					driver=new EdgeDriver();
				}
				else
				{
					driver=new ChromeDriver();
				}
			
			System.out.println(browser);
			
			/*
			 System.out.println(USERNAME); 
			 System.out.println(PASSWORD);
			 */
 
	//WebDriver driver = new ChromeDriver();
	driver.get(URL);
	Thread.sleep(2000);
	driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	driver.findElement(By.id("submitButton")).click();
	
	//Thread.sleep(2000);
	driver.findElement(By.linkText("Organizations")).click();
	driver.quit();

	
	
	
}
}