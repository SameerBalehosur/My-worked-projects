package com.mavenproject.dao;
import java.util.Scanner;

public class DriverFactory {
	public Books  use(Books books) {
		books.sql();
		books.java();
		books.jdbc();
		return books;
		
	}
	
}
