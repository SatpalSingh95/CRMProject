package practice.datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/*public class ReadDataBasedOnConditionTest
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	
	String expectedTestId="tc_02";
	//String data="";
			FileInputStream fis = new FileInputStream("D:\\SeleniumBasic\\SeleniumCRMGUIFramework\\testData\\TestScriptData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);	
			Sheet sh=wb.getSheet("org");
			
			
	int rowCount=sh.getLastRowNum();
			
		
		for(int i=0;i<=rowCount;i++)
		{
			String data="";
			try 
			{
		    data =sh.getRow(i).getCell(0).toString();
			}
			catch(Exception e)
			{
			}
			System.out.println(data);
		}
		wb.close();
}
}*/

/*

// If the test cases available then read the complete row data

public class ReadDataBasedOnConditionTest
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	
	String expectedTestId="tc_02";
	//String data="";
	String data1="";
	 String data2="";
	 String data3="";
			FileInputStream fis = new FileInputStream("D:\\SeleniumBasic\\SeleniumCRMGUIFramework\\testData\\TestScriptData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);	
			Sheet sh=wb.getSheet("org");		
	int rowCount=sh.getLastRowNum();
		for(int i=0;i<=rowCount;i++)
		{
			String data="";
			try 
			{
		    data =sh.getRow(i).getCell(0).toString();
		    if(data.equals(expectedTestId))
		    {
		    	  data1 =sh.getRow(i).getCell(1).toString();
		    	  data2 =sh.getRow(i).getCell(2).toString();
		    	  data3 =sh.getRow(i).getCell(3).toString();
		    }
			}
			catch(Exception e) {}
		}
			//System.out.println(data);
			System.out.println(data1);
			System.out.println(data2);
			System.out.println(data3);
		
		wb.close();
}
}
*/
/*==========================*/

// if Test case Id is not available somebody deleted this i am expecting 100 th data that is not there.

public class ReadDataBasedOnConditionTest
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	
	String expectedTestId="tc_100";
	//String data="";
	String data1="";
	 String data2="";
	 String data3="";
	 
	 boolean flag=false;
			FileInputStream fis = new FileInputStream("D:\\SeleniumBasic\\SeleniumCRMGUIFramework\\testData\\TestScriptData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);	
			Sheet sh=wb.getSheet("org");		
	int rowCount=sh.getLastRowNum();
		for(int i=0;i<=rowCount;i++)
		{
			String data="";
			try 
			{
		    data =sh.getRow(i).getCell(0).toString();
		    if(data.equals(expectedTestId))
		    {
		    	flag=true;
		    	  data1 =sh.getRow(i).getCell(1).toString();
		    	  data2 =sh.getRow(i).getCell(2).toString();
		    	  data3 =sh.getRow(i).getCell(3).toString();
		    }
			}
			catch(Exception e) {}
		}
		if(flag==true)
		{
			
			System.out.println(data1);
			System.out.println(data2);
			System.out.println(data3);
			
		}
		else
		{
			
			System.out.println(expectedTestId + " data is not available");
		}
		
			
		
		wb.close();
}
}

