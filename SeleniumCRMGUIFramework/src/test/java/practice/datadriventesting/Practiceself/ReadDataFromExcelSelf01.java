package practice.datadriventesting.Practiceself;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelSelf01 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
FileInputStream fis= new FileInputStream("C:\\Users\\Satpal Singh\\Desktop\\PracticeDataDrivenTesting\\TestScriptData.xlsx");	
Workbook wb = WorkbookFactory.create(fis);

Sheet sh = wb.getSheet("org");

Row row = sh.getRow(0);

  Cell cell = row.getCell(0);
  
String Data = cell.getStringCellValue();
System.out.println(Data);

String data1 = sh.getRow(0).getCell(0).getStringCellValue();
System.out.println(data1);

//double data2=sh.getRow(2).getCell(1).getColumnIndex();
//System.out.println(data2);
String data2 = sh.getRow(1).getCell(1).getStringCellValue();
System.out.println(data2);

// String data3 = sh.getRow(2).getCell(2).getStringCellValue();
//System.out.println(data3);

// Recommended
String data =wb.getSheet("org").getRow(3).getCell(3).toString();
System.out.println(data);


wb.close();

}
}
