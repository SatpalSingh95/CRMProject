package practice.datadriventesting.Practiceself;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcelToFetchWholeCoulmnSelf03 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
FileInputStream fis= new FileInputStream("C:\\Users\\Satpal Singh\\Desktop\\PracticeDataDrivenTesting\\TestScriptData.xlsx");	
Workbook wb = WorkbookFactory.create(fis);

Sheet sh = wb.getSheet("Sheet1");

for(int i=2;i<18;i++)
{
String columndata1	=sh.getRow(i).getCell(0).toString();
String columndata2	=sh.getRow(i).getCell(1).toString();
String columndata3	=sh.getRow(i).getCell(2).toString();
String columndata4	=sh.getRow(i).getCell(3).toString();
System.out.println(columndata1+"\t"+columndata2);
}


}
}
