package com.employee.payroll1;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.Driver;

public class Connection {
	public static String jdbcURL = "jdbc:mysql://localhost:3306/payroll_service?useSSL=false";
	public static String userName = "root";
	public static String password = "123456";
	Connection con
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded!");
	}catch(ClassNotFoundException e)
	{
		throw new IllegalStateException("Cannot find the driver in the classpath!", e);
	}

	listDrivers();
	try
	{
		System.out.println("Connecting to database:" + jdbcURL);
		con = DriverManager.getConnection(jdbcURL, userName, password);
		System.out.println("Connection is success" + con);
	}catch(
	Exception e)
	{
		e.printStackTrace();
	}

	private static void listDrivers1() {
		Enumeration<Driver> driverList = DriverManager.getDrivers();
		while (driverList.hasMoreElements()) {
			Driver driverClass = (Driver) driverList.nextElement();
			System.out.println(" " + driverClass.getClass().getName());
		}

	}
 }
}
