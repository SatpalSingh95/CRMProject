package practice.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class SampleUnitTestCheckProjectInBackEnd2 {
	
	@Test
	public void project1CheckTest() throws SQLException
	{
		// mtrip ---if we get this result then we have seen test case is pass in case of using if and else so we use . if you want to fail unit test case 
		//you have to write Assert this is the feature of TestNg tool
		
		String expectedProjectName ="mtrip"; // project name
		boolean flag=false;
		
		// step1 load/ register the database driver
		
				Driver driverRef =new Driver();
				DriverManager.registerDriver(driverRef);
				
				// step2:Establish the  connection to the  database
				
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root", "root");
				
				System.out.println("Successfully connected to the database "+conn);
				
				// After calling this method, it will give the Statement object where you can execute a query. using that statement object
				// so that it allows to write a statement and then execute sql statements 
				//create SQL statement
				Statement statement=conn.createStatement();
				
				// step 4: execute select query and get result
				ResultSet resultset = statement.executeQuery("select * from project1");
				
				
		
				
				
				// fetch the data from table and display in the consol 
				while(resultset.next())
				{
					String actProjectName=resultset.getString(4);
					//System.out.println(actProjectName);
					
					if(expectedProjectName.equals(actProjectName))
					{
						flag=true;
						System.out.println(expectedProjectName+ " is available === pass");
						
					}
					// i can not write else block here the reason is very first time execution you know in while loop execution start at the first time
					// then it is sure that expectedProjectName(mytrip) is not there that time it execute in else block.again second time expected project is not avalaible
					// again it will execute else block.until and unless you get projectName it keep executing else. keep saying that project is not available .....that is the reason 
					//failed result you will not write in else block.instead of this we write the outside the while loop
					
				}
				if(flag==false)
				{
					System.out.println(expectedProjectName + " is not available==fail");
					Assert.fail();
				}
				
				
				
				
				
				//close condition
				conn.close();
				
	}
}
