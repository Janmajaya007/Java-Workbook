package com.jdbc.introduction;

import java.sql.*;

public class practice {

	public static void main(String[] args) throws SQLException {
		
		Connection myConnection = null;
		Statement myStatement =null;
		ResultSet myRsultSet=null;
		
		String dbUrl = "jdbc:mysql://localhost:3306/demo?useSSL=false";
		String user = "student";//databaseAdmin Name
		String pass = "YES"; // databseAdmin Password
		
		try {
			//1. Get a connection to database
			myConnection = DriverManager.getConnection(dbUrl, user, pass);
			//2. Create a statement
			myStatement = myConnection.createStatement();
			//3. Execute SQL query
			myRsultSet = myStatement.executeQuery("select * from employees");
			//4. Process the result set
			while (myRsultSet.next()) {
				System.out.println(myRsultSet.getString("first_name"));
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(myConnection  != null)
			{
				myConnection.close();
			}
			
			if(myStatement  != null)
			{
				myStatement.close();
			}
			
			if(myRsultSet  != null)
			{
				myRsultSet.close();
			}
		}
		
	}

}
