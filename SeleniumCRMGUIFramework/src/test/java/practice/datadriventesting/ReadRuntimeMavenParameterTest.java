package practice.datadriventesting;

import org.testng.annotations.Test;

public class ReadRuntimeMavenParameterTest
{
@Test
public void runtimeParameterTest()
{
	// how to receive maven parameters from the command line
	
	// how to receive parameter in testng test class
	/*
	 String url=System.getProperty("url"); // capture the data from maven cmd
	System.out.println("Env Data ===>URL===>"+url);
	 */
	
	String URL=System.getProperty("url");
	String BROWSER=System.getProperty("browser");
	String USERNAME=System.getProperty("username");
	String PASSWORD=System.getProperty("password");
	
	System.out.println("Env Data ===>URL===>"+URL);
	System.out.println("Browser Data ===>===>"+BROWSER);
	System.out.println("Username Data ===>===>"+USERNAME);
	System.out.println("password Data ===>===>"+PASSWORD);
}
}
  