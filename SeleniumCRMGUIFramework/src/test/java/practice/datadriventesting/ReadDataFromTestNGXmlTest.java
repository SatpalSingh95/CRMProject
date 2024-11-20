package practice.datadriventesting;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadDataFromTestNGXmlTest 
{
	
	/*
	@Test
	public void sampleTest()
	{
		System.out.println("Execute Sample Test");
	}
	
	*/
	
	// TestNg provide XmlTest class Using this class we can read the xml file.
	// getParameter() is a method to read parameter from xml file
	
	@Test
	public void sampleTest(XmlTest test)
	{
		System.out.println("Execute Sample Test");
		System.out.println(test.getParameter("browser"));
		System.out.println(test.getParameter("url"));
		System.out.println(test.getParameter("username"));
		System.out.println(test.getParameter("password"));
	}

}
