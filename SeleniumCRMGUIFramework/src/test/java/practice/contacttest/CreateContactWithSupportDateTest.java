package practice.contacttest;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateContactWithSupportDateTest 
{
public static void main(String[] args) throws InterruptedException, IOException 
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
				

			
			//generate the random Number
			Random random =new Random();
			int randomInt=random.nextInt(1000);
			
			
			
			// Read TestScript data from Excel file
			FileInputStream fs = new FileInputStream("D:\\SeleniumBasic\\SeleniumCRMGUIFramework\\testData\\TestScriptData.xlsx");
			Workbook wb = WorkbookFactory.create(fs);
		     Sheet sh=wb.getSheet("contact");
			     Row row=sh.getRow(4);
			     String lastName = row.getCell(2).toString() +randomInt;
			    
				 System.out.println(lastName);
			
			wb.close();
			
		
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
			// login to Application
 
	// login to the Application
	driver.get(URL);
	Thread.sleep(2000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	driver.findElement(By.id("submitButton")).click();
	
	// Navigate the Contact module
	//Thread.sleep(2000);
	driver.findElement(By.linkText("Contacts")).click();
	

	// Step:3 click on "Create Contacts " Button
	
	driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
	
	// Step 4 enter all the details and create new Organization
	 Date dateobj=new Date();
	 SimpleDateFormat sim= new SimpleDateFormat("yyyy-MM-dd");
	 String  startDate=sim.format(dateobj);
	 System.out.println(startDate);
	 
	Calendar cal= sim.getCalendar();
	//cal.add(Calendar.DAY_OF_MONTH, -30);
	cal.add(Calendar.DAY_OF_MONTH, 30);
	String endDate=sim.format(cal.getTime());
	System.out.println(endDate);
	
	driver.findElement(By.name("lastname")).sendKeys(lastName);

	driver.findElement(By.name("support_start_date")).clear();
     driver.findElement(By.name("support_start_date")).sendKeys(startDate);
     
     driver.findElement(By.name("support_end_date")).clear();
     driver.findElement(By.name("support_end_date")).sendKeys(endDate);
	
	// phone number
	//driver.findElement(By.id("phone")).sendKeys(lastName);
	
	
	
	driver.findElement(By.name("button")).click();
	Thread.sleep(2000);
	
	
	// verify header phone Number info Expected Result

	
	String actStartDate = driver.findElement(By.id("dtlview_Support Start Date")).getText();
	if(actStartDate.trim().equals(startDate))
	{
		System.out.println(startDate + " information is verified == PASS");
		}
	else
	{
		System.out.println(startDate + "is not verified == FAIL");
	}
	Thread.sleep(2000);
	
	String actendDate = driver.findElement(By.id("dtlview_Support End Date")).getText();
	if(actStartDate.trim().equals(startDate))
	{
		System.out.println(startDate + "information is  verified == PASS");
		}
	else
	{
		System.out.println(startDate + "information is not verified == FAIL");
	}
	
	
	// Step :5 logout
driver.quit();

	
		
}
}
