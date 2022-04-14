package com.jdbc.practice;

import java.sql.*;

public class jdbcUpdateDemo {

	public static void main(String[] args) throws SQLException {

		Connection myCon = null;
		Statement myStat = null;
		ResultSet rs = null;

		String dburl = "jdbc:mysql://localhost:3306/demo?useSSL=false";
		String user = "student";
		String pass = "YES";
		try {
			myCon = DriverManager.getConnection(dburl, user, pass);
			myStat = myCon.createStatement();

			System.out.println("Update the email value in employees table");
			System.out.println("Table before Update \n");

			display(myCon, "Janmajaya", "Gantayat");

			int updatedRow = myStat.executeUpdate("update employees" + "se email=janmajaya2000@gmai.com"
					+ "where last_name='Gantayat' and first_name='Janmajaya'");

			System.out.println(updatedRow);

			System.out.println("After update\n");
			display(myCon, "Janmajaya", "Gantayat");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (myStat != null) {
				myStat.close();
			}
			if (myCon != null) {
				myCon.close();
			}
		}

	}

	private static void display(Connection myConn, String firstName, String lastName) throws SQLException {

		PreparedStatement myStmt = null;
		ResultSet myRs = null;

		try {
			// Prepare statement
			myStmt = myConn.prepareStatement(
					"select last_name, first_name, email from employees where last_name=? and first_name=?");

			myStmt.setString(1, lastName);
			myStmt.setString(2, firstName);

			// Execute SQL query
			myRs = myStmt.executeQuery();

			// Process result set
			while (myRs.next()) {
				String theLastName = myRs.getString("last_name");
				String theFirstName = myRs.getString("first_name");
				String email = myRs.getString("email");

				System.out.printf("%s %s, %s\n", theFirstName, theLastName, email);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (myRs != null) {
				myRs.close();
			}
			if (myStmt != null) {
				myStmt.close();
			}
		}

	}

}
