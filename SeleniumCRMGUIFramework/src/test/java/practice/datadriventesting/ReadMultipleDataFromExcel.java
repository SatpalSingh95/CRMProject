package practice.datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	// step:1 get the Excel path location & java Object of the Physical ExcelFile
	
			FileInputStream fis = new FileInputStream("D:\\SeleniumBasic\\SeleniumCRMGUIFramework\\testData\\TestScriptData.xlsx");
			
			
			// step:2 open WorkBook in read mode
			Workbook wb = WorkbookFactory.create(fis);	
			
			// step:3 get the control of the "org" sheet

			Sheet sh=wb.getSheet("Sheet1");
			
			
	//		Row row =sh.getRow(1);
			
		//String column1Data=row.getCell(0).toString();
		//	String column2Data=row.getCell(1).toString();
		
			/*String column1Data=row.getCell(0).getStringCellValue();
			String column2Data=row.getCell(1).getStringCellValue();
			*/
			
			/*System.out.println(column1Data);
			System.out.println(column2Data);*/
			
			
		
			
			for(int i=1;i<51;i++)
			{
				Row row =sh.getRow(i);
				String column1Data=row.getCell(0).toString();
				String column2Data=row.getCell(1).toString();
				System.out.println(column1Data +"\t" +column2Data);
				
			}
			
			wb.close();
}
}
