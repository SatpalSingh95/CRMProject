package practice.datadriventesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateProjectAndVerifyDataINDBWITHGUI 
{
public static void main(String[] args) {
	// Create a project In GUI using selenium code
	
	String projectName="Instagram_01";
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8084");
	
	driver.findElement(By.id("username")).sendKeys("rmgyantra");
	driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
	driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	
	driver.findElement(By.linkText("Projects")).click();
	
	driver.findElement(By.xpath("//span[text()='Create Project']")).click();
	
	driver.findElement(By.name("ProjectName")).sendKeys(projectName);
	
	driver.findElement(By.name("createdBy")).sendKeys("deepak");
	
	Select sel=new Select(driver.findElement(By.name("status")));
	sel.selectByIndex(0);
	
	driver.findElement(By.xpath("//input[@value='Add Project']")).click();
	
	// verify the project in BackEnd [DB]using JDBC
	
}
	
}
