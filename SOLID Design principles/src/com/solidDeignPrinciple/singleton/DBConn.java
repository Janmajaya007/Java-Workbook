package com.solidDeignPrinciple.singleton;

public class DBConn {
	private static DBConn instance;
	
	private DBConn() {
	}
	
	public static DBConn getInstance() {
		synchronized(DBConn.class) {
			if(DBConn.instance==null)
				DBConn.instance = new DBConn();
		}
		return DBConn.instance;
	}
	
	public void show() {
		System.out.println("This is an object of "+this.getClass().getSimpleName());
	}
}
