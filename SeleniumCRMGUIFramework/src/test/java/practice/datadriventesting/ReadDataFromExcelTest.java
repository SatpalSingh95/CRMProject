package practice.datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelTest {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// step:1 get the Excel path location & java Object of the Physical ExcelFile
		
		FileInputStream fis = new FileInputStream("D:\\SeleniumBasic\\SeleniumCRMGUIFramework\\testData\\TestScriptData.xlsx");
		
		
		// step:2 open WorkBook in read mode
		Workbook wb = WorkbookFactory.create(fis);
		
		/* shortcut
		 * Cell a = wb.getSheet("org").getRow(1).getCell(3);
		 double data = (double)a.getNumericCellValue();
		System.out.println(data);
		*/

		// step:3 get the control of the "org" sheet

		Sheet sh=wb.getSheet("org");
		 
		  // step:4 get the control of first row
		     Row row=sh.getRow(1); 
		     
		     
		    
		

		// step:5 get the control of 2nd cell and read the String data

	//Cell cell= row.getCell(1);

//Cell cell= row.getCell(2);
		     
		    /* Cell cell= row.getCell(3);	     

String data = cell.getStringCellValue();
System.out.println(data); */

/*
		String data = row.getCell(1).getStringCellValue();
		System.out.println(data);
*/
		     
		 /*    double data = row.getCell(3).getNumericCellValue();
			 System.out.println(data);
		   */  
		     
	/*	String data = row.getCell(3).getStringCellValue();
		 System.out.println(data);
*/
		     
		     String data = row.getCell(3).toString();
			 System.out.println(data);
		 
		 
		     
		     
		     
		   
		     
// step:6 close the Workbook
		wb.close();

	}
}
