package com.jdbc.practice;
import java.sql.*;
public class jdbcDemo {

	public static void main(String[] args) throws SQLException {
		
		try {
			
			Connection myConn =null;
			Statement myStat =null;
			ResultSet Rset = null;
			
			String dburl = "jdbc:mysql://localhost:3306/demo?useSSL=false";
			String user = "student";
			String pss = "YES";
			
			myConn = DriverManager.getConnection(dburl, user, pss);
			
			myStat = myConn.createStatement();
			
			Rset= myStat.executeQuery("select * from employees");
			
			while(Rset.next()) {
				System.out.println(Rset.getString("first_name")+" | | "+Rset.getString("last_name")
						+" | | "+Rset.getString("email"));
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
