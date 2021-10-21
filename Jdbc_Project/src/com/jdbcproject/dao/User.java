package com.jdbcproject.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class User {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?user=root&password=root");
		Statement statement = connection.createStatement();
		String qry="select * from virat order by percentage desc limit 2";
		ResultSet update = statement.executeQuery(qry);
		while(update.next()) {
			System.out.println(update.getInt(1));
			System.out.println(update.getString(2));
			System.out.println(update.getDouble(3));
			System.out.println(update.getInt(4));
		}
		System.out.println("Data fetched");
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
}
}
