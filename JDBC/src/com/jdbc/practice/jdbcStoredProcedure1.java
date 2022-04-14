package com.jdbc.practice;
import java.sql.*;
public class jdbcStoredProcedure1 {

	public static void main(String[] args) throws SQLException {
		
		Connection myCon =null;
		ResultSet myRes = null;
		try {
			
			//connect to the database
			myCon= DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/demo?useSSL=false", "student", "YES");
			
			// Prepare the stored procedure call
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(myRes!= null) {
				myRes.close();
			}
			if(myRes!= null) {
				myRes.close();
			}
			if(myCon!= null) {
				myCon.close();
			}
		}
		
	}

}
