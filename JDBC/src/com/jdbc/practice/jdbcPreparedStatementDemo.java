package com.jdbc.practice;

import java.sql.*;

public class jdbcPreparedStatementDemo {

	public static void main(String[] args) throws SQLException {
		Connection myCon = null;
		PreparedStatement myState = null;
		ResultSet myRes = null;
		try {
			// connect to the database
			myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?useSSL=false", "student", "YES");

			// prepare the statement
			myState = myCon.prepareStatement("select * from employees where salary > ? and department=?");

			// Set the parameters
			myState.setDouble(1, 80000);
			myState.setString(2, "Legal");

			// exeute the query
			myRes = myState.executeQuery();

			// Display the result set
			display(myRes);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (myRes != null) {
				myRes.close();
			}
			if (myState != null) {
				myState.close();
			}
			if (myCon != null) {
				myCon.close();
			}
		}
	}

	private static void display(ResultSet myRs) throws SQLException {
		while (myRs.next()) {
			String lastName = myRs.getString("last_name");
			String firstName = myRs.getString("first_name");
			double salary = myRs.getDouble("salary");
			String department = myRs.getString("department");

			System.out.printf("%s, %s, %.2f, %s\n", lastName, firstName, salary, department);
		}
	}

}
