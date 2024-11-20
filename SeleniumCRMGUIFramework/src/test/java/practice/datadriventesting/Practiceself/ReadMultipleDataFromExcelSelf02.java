package practice.datadriventesting.Practiceself;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
// To Fetch Whole Column
public class ReadMultipleDataFromExcelSelf02 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
FileInputStream fis= new FileInputStream("C:\\Users\\Satpal Singh\\Desktop\\PracticeDataDrivenTesting\\TestScriptData.xlsx");	
Workbook wb = WorkbookFactory.create(fis);

Sheet sh = wb.getSheet("Sheet1");
int rowCount=sh.getLastRowNum();

for(int i=2;i<rowCount;i++)
{
String columndata1	=sh.getRow(i).getCell(0).toString();
String columndata2	=sh.getRow(i).getCell(1).toString();

System.out.println(columndata1+"\t"+columndata2);
}


}
}
