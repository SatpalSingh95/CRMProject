package practice.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ExecuteNonSelectQueryTest {

	public static void main(String[] args) throws SQLException 
	{
	// step1 load/ register the database driver
		
		Driver driverRef =new Driver();
		DriverManager.registerDriver(driverRef);
		
		// step2:Establish the  connection to the  database
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root", "root");
		
		System.out.println("Successfully connected to the database "+conn);
		
		// After calling this method, it will give the Statement object where you can execute a query. using that statement object
		// so that it allows to write a statement and then execute sql statements 
		//create SQL statement
		Statement stat=conn.createStatement();
		
		// step 4: execute non select query and get result
		/*
		 * int result=stat.executeUpdate("sqlQuery"); System.out.println(result);
		 */
		
  
		// step 4: execute non select query and get result
		
		  int result=stat.executeUpdate("insert into project1 values (2001,'Vatan','06/09/2021','AirAsia','pass',50);"); 
		  System.out.println(result);
		 // execute this if the result is given 1 or -1 then it will executed properly. otherwise if it will give 0 then result is not executed.
	
}
}
// how to execute non select query.