package com.mavenproject.dao;
public class BookDemo {

	public static void main(String[] args) {
		DriverFactory driverFactory=new DriverFactory();
		Books  books=BookFactory.getBook();
		driverFactory.use(books);
		driverFactory.use(books);
	}

}
