package com.jdbc.practice;

import java.sql.*;

public class jdbcInsertDemo {

	public static void main(String[] args) throws SQLException {
		Connection myConn = null;
		Statement myStat = null;
		ResultSet rys = null;
		String dburl = "jdbc:mysql://localhost:3306/demo?useSSL=false";
		String user = "student";
		String pass = "YES";
		try {

			myConn = DriverManager.getConnection(dburl, user, pass);

			myStat = myConn.createStatement();

			System.out.println("Inserting a new employee to database");

			int rowsAffected = myStat
					.executeUpdate("insert into employees (first_name, last_name)" + "values('Janmajaya','Gantayat')");

			System.out.println(rowsAffected);

			rys = myStat.executeQuery("Select * from employees");
			while (rys.next()) {
				System.out.println(rys.getString("first_name") + "     " + rys.getString("last_name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			if (rys != null) {
				rys.close();
			}
			if (myStat != null) {
				myStat.close();
			}
			if (myConn != null) {
				myConn.close();
			}
		}
	}

}
