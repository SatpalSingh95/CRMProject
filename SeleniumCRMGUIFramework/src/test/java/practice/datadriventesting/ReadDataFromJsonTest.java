package practice.datadriventesting;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
// Read data from Json file
public class ReadDataFromJsonTest 
{
public static void main(String[] args) throws FileNotFoundException, IOException, ParseException 
{
//Step 1: parse json physical file into java Object using JSonParse class	
	
	JSONParser parser = new JSONParser();
	Object obj=parser.parse(new FileReader("D:\\SeleniumBasic\\SeleniumCRMGUIFramework\\testData\\appCommonData.json"));    // parse means convert One object into another object.(physical json file into java json object)
	
	//step:2  convert java Object into JSONObject using downcasting 
	JSONObject map=(JSONObject)obj;
	
	//step:3 get the value from json file using key
	System.out.println(map.get("url")); ;
	
	System.out.println(map.get("browser"));
	System.out.println(map.get("username"));
	System.out.println(map.get("password"));
	System.out.println(map.get("timeOut"));
}
}
