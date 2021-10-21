package com.jdbcproject.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableImpl {

	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter the Id");
//		int id = scanner.nextInt();
//		System.out.println("Enter the Name");
//		String name=scanner.next();
//		System.out.println("Enter the Salary");
//		double sal=scanner.nextDouble();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?user=root&password=root");
			CallableStatement call = connection.prepareCall("call m3()");
			ResultSet set= call.executeQuery();
			while(set.next()) {
				System.out.println(set.getInt(1));
				System.out.println(set.getString(2));
				System.out.println(set.getDouble(3));
			}
//			call.setInt(1,id);
//			call.setString(2, name);
//			call.setDouble(3, sal);
//			int update = call.executeUpdate();
			System.out.println("Data Fetched");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
