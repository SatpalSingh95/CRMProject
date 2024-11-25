package practice.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ExecuteSelectQueryTest2 {
 public static void main(String[] args) throws SQLException {
	
	 Connection conn = null;
	 try {
	// step1 load/ register the database driver
		
			Driver driverRef =new Driver();
			DriverManager.registerDriver(driverRef);
			
			// step2:Establish the  connection to the  database
			
			 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root", "root");
			
			System.out.println("Successfully connected to the database "+conn);
			
			// After calling this method, it will give the Statement object where you can execute a query. using that statement object
			// so that it allows to write a statement and then execute sql statements 
			//create SQL statement
			Statement statement=conn.createStatement();
			
			// step 4: execute select query and get result
			ResultSet resultset = statement.executeQuery("select * from project1");
			
			/*
			// fetch the data of single column 
			while(resultset.next())
			{
				System.out.println(resultset.getString(1));
				
			}
	*/
			
			
			
			// fetch the data from table and display in the consol 
			while(resultset.next())
			{
				System.out.println(resultset.getString(1)+ "\t" +resultset.getString(2)+"\t"+resultset.getString(3)+"\t"+resultset.getString(4)+"\t"+resultset.getString(5)+"\t"+resultset.getString(6));
				
			}
			
	 }
	 catch (Exception e) {
		System.out.println("handle exception");
	}
			finally {
			//close condition
			conn.close();
			System.out.println("=======close a connection=========");
			}
}
}
// make mistakes in this program in differnt methods and querys to know the Exception and close the connection 
