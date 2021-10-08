package com.seleniumproject.generic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.jdbc.Driver;

public class DatabaseUtility {
	ResultSet result = null;
	Connection conn = null;
	public void connectToDB() throws Throwable {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		conn = DriverManager.getConnection(IPathConstants.dbUrl, IPathConstants.dbUsername, IPathConstants.dbPassword);
	}
	
	public void closeDB() throws Throwable {
		conn.close();
	}
	
	public String executeQueryAndGetData(String query, int columnIndex, String expData) throws Throwable {
		boolean flag = false;
		result = conn.createStatement().executeQuery(query);
		while (result.next()) {
			String data = result.getString(columnIndex);
			if (data.equalsIgnoreCase(expData)) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println(expData+" The data is verified");
			return expData;
		} else {
			System.out.println(expData+" The data is not verified");
			return "";
		}
	}
}
