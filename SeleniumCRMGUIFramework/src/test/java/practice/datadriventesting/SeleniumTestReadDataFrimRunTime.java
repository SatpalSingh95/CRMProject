package practice.datadriventesting;

//public class SeleniumTestReadDataFrimRunTime 
//{
	
	
//@Test
//public void seleniumTest() throws IOException, InterruptedException
//{
	// Read common data from Properties file
	//FileInputStream fis = new FileInputStream("C:\\Users\\Satpal Singh\\Desktop\\Commondata.properties"); 
	
	
	// step 2  using properties class, load all the keys
	
	/*Instead of property file i want to read data from the command line.
	 
	  Properties pobj=new Properties();
	pobj.load(fis);

	//step:3 Read the Data using getProperty method
	String BROWSER =pobj.getProperty("browser");
	String URL =pobj.getProperty("url");
	String USERNAME =pobj.getProperty("username");
	String PASSWORD=pobj.getProperty("password");
	
	*/
	// i want to read the data from cmd
	
//	String BROWSER =
	//String URL =
	//String USERNAME =
	//String PASSWORD=
	
	
/*	WebDriver driver=null;
	
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
	

	// step 1: Login to app	
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get(URL);
Thread.sleep(2000);
driver.findElement(By.name("user_name")).sendKeys(USERNAME);
driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
driver.findElement(By.id("submitButton")).click();

//Step:2 Navigation to the organization module
	driver.findElement(By.linkText("Organizations")).click();
	
	driver.quit();
	
	}
}
*/