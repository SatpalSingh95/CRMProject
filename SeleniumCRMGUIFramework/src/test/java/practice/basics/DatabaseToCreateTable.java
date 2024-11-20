package practice.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DatabaseToCreateTable {

	public static void main(String[] args) throws SQLException 
	{
	// step1 load/ register the database driver
		
		Driver driverRef =new Driver();
		DriverManager.registerDriver(driverRef);
		
		// step2:Establish the  connection to the  database
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root", "root");
		
		System.out.println("Successfully connected to the database "+conn);
		
		//create sql statement
		
		Statement statement=conn.createStatement();
		
		// Execute query statements and get Results
		
	//	String query ="CREATE TABLE project1(project_id INT PRIMARY KEY, created_by VARCHAR(100), created_on VARCHAR(100), project_name VARCHAR(100), status VARCHAR(100), team_size INT CHECK(team_size>=0))";
		
		//statement.execute(query);
		
		
		String insertQuery="INSERT INTO project1(project_id,created_by,created_on,project_name,status,team_size)" + "VALUES(1002,'Deepak','08/09/2022','shopper','pass',120), (1003,'pankaj','09/09/2022','shopper','pass',80),"
				+ " (1004,'Anuj','10/09/2022','shopper','fail',30), (1007,'remaan','10/09/2022','shopper','NA',30), (1006,'maan','05/09/2022','shopper','NA',90);";
		statement.execute(insertQuery);
		
		
		
		//close condition
		conn.close();
		
		
	}
}
