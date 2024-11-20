package practice.contacttest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Integration
public class CreateContactWithOrgTest {
	public static void main(String[] args) throws InterruptedException, IOException {

		// step1 : get the java representation object of the physical file
		FileInputStream fis = new FileInputStream(
				"D:\\SeleniumBasic\\SeleniumCRMGUIFramework\\testData\\Commondata.properties");
		// step 2 using properties class, load all the keys

		Properties pobj = new Properties();
		pobj.load(fis);

		// step:3 Read the Data using getProperty method
		String BROWSER = pobj.getProperty("browser");
		String URL = pobj.getProperty("url");
		String USERNAME = pobj.getProperty("username");
		String PASSWORD = pobj.getProperty("password");

		// generate the random Number
		Random random = new Random();
		int randomInt = random.nextInt(1000);

		// Read TestScript data from Excel file
		FileInputStream fs = new FileInputStream(
				"D:\\SeleniumBasic\\SeleniumCRMGUIFramework\\testData\\TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fs);
		Sheet sh = wb.getSheet("contact");
		Row row = sh.getRow(7);
		String orgName = row.getCell(2).toString() + randomInt;
		
	String contactLastName = row.getCell(3).toString() + randomInt;
		System.out.println(contactLastName);

		wb.close();

		WebDriver driver = null;

		if (BROWSER.equals("chrome")) {

			driver = new ChromeDriver();

		} else if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}

		System.out.println(BROWSER);
		
		//step:1  login to Application
          driver.get(URL);
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();

		// Thread.sleep(2000);
		// step:2 navigate to Organization module
		driver.findElement(By.linkText("Organizations")).click();

		// Step:3 click on "Create Contacts " Button
        driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
         // Step 4 enter all the details and create new Organization
          driver.findElement(By.name("accountname")).sendKeys(orgName);
		Thread.sleep(2000);
		driver.findElement(By.name("button")).click();
		Thread.sleep(2000);

		// verify header phone Number info Expected Result
String headerInfo=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
if(headerInfo.contains(orgName))
{
	System.out.println(orgName + "header verified===Pass");
	}
else
{
	System.out.println(orgName + "header is not  verified==Fail");	
}

		

		// step 5: navigate to contact module
		driver.findElement(By.linkText("Contacts")).click();
		
       // Step:6 click on "Create Contacts " Button
        driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
        
         // Step 7enter all the details and create new Organization
          driver.findElement(By.name("lastname")).sendKeys(contactLastName);
          
       // look up window
  		driver.findElement(By.xpath("//input[@name='account_name']/following-sibling::img")).click();

		// switch to child window
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);

			String actUrl = driver.getCurrentUrl();
			if (actUrl.contains("module=Accounts")) {
				break;
			}
		}
  		driver.findElement(By.name("search_text")).sendKeys(orgName);
		driver.findElement(By.name("search")).click();
		driver.findElement(By.xpath("//a[text()='"+orgName+"']")).click();
		
		// switch to parent window
				Set<String> set1 = driver.getWindowHandles();
				Iterator<String> it1 = set.iterator();
				while (it1.hasNext()) {
					String windowId = it1.next();
					driver.switchTo().window(windowId);

					String actUrl = driver.getCurrentUrl();
					if (actUrl.contains("Contacts&action")) {
						break;
					}
				}
				driver.findElement(By.name("button")).click();

			 headerInfo = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
				if(headerInfo.trim().contains(contactLastName))
				{
					System.out.println(contactLastName + "is verified == PASS");
					}
				else
				{
					System.out.println(contactLastName+ "is not verified == FAIL");
				}
				// verify header orgName info Expected Result

				
				String actOrgName = driver.findElement(By.id("mouseArea_Organization Name")).getText();
				if(actOrgName.trim().contains(orgName))
				{
					System.out.println(orgName + "is verified == PASS");
					}
				else
				{
					System.out.println(orgName + "is not verified == FAIL");
				}
		Thread.sleep(2000);
		// Step :5 logout
				driver.quit();
	}
}
