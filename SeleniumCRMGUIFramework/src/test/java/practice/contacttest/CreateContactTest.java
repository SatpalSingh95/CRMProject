package practice.contacttest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
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

public class CreateContactTest {
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
		Row row = sh.getRow(1);
		String lastName = row.getCell(2).toString() + randomInt;

		System.out.println(lastName);

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
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();

		// Thread.sleep(2000);
		// step:2 navigate to contact module
		driver.findElement(By.linkText("Contacts")).click();

		// Step:3 click on "Create Contacts " Button
        driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
         // Step 4 enter all the details and create new Organization
          driver.findElement(By.name("lastname")).sendKeys(lastName);
		Thread.sleep(2000);
		driver.findElement(By.name("button")).click();
		Thread.sleep(2000);

		// verify header phone Number info Expected Result

		String actLastName = driver.findElement(By.id("dtlview_Last Name")).getText();
		if (actLastName.trim().contains(lastName)) {
			System.out.println(lastName + " is created == PASS");
		} else {
			System.out.println(lastName + " is not created == FAIL");
		}
		Thread.sleep(2000);

		// Step :5 logout
		driver.quit();

	}
}
