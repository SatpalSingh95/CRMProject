package practice.datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class CreateOrgTestReadDataFromXml08 
{
	@Test
	public void createOrgtest(XmlTest test) throws IOException, InterruptedException, ParseException
	{          
		//      Read the Data from xml file
		
		
		        String URL = test.getParameter("url");
				String BROWSER =test.getParameter("browser");
			    String USERNAME = test.getParameter("username");
				String PASSWORD=test.getParameter("password");
			
				
				//generate the random Number
				Random random =new Random();
				int randomInt=random.nextInt(1000);
				
				
				
				// Read TestScript data from Excel file
				FileInputStream fs = new FileInputStream("D:\\SeleniumBasic\\SeleniumCRMGUIFramework\\testData\\TestScriptData.xlsx");
				Workbook wb = WorkbookFactory.create(fs);
			     Sheet sh=wb.getSheet("org");
				     Row row=sh.getRow(1);
				     String orgName = row.getCell(2).toString() +randomInt;
					 System.out.println(orgName);
				
				wb.close();
				
			/*	Scanner sc = new Scanner(System.in);
				System.out.println("Enter the Browser");
				
				String browser=sc.next();
				*/
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
				
				System.out.println(BROWSER);
				
	 
		//WebDriver driver = new ChromeDriver();
		driver.get(URL);
		Thread.sleep(2000);
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		
		//Thread.sleep(2000);
		driver.findElement(By.linkText("Organizations")).click();
		

		// Step:3 click on "Create Organization " Button
		
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		
		// Step 4 enter all the details and create new Organization
		
		driver.findElement(By.name("accountname")).sendKeys(orgName);
		Thread.sleep(2000);
		
		driver.findElement(By.name("button")).click();
		Thread.sleep(2000);
		
		// Step :5 logout
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
		
	driver.quit();

		
		
		
	
}
}
