package com.solidDeignPrinciple.singleton;

public class Main {
	public static void main(String[] args) {
		DBConn DB = DBConn.getInstance();
		DB.show();
	} 
} 
