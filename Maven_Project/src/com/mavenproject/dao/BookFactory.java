package com.mavenproject.dao;
import java.util.Scanner;

public class BookFactory {
	public static Books getBook() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your using creteria \n1 Employees \n2 TestYantra \n3 Jspider");
		String n=scanner.next();
		if(n.equalsIgnoreCase("Employees")) {
			return new Employees();
		}else if(n.equalsIgnoreCase("TestYantra")){
			return new 	TestYantra();	
		}else if(n.equalsIgnoreCase("Jspider")) {
			return new Jspider();
		}else {
			System.out.println("Invalid choice");
		}
		return null;
	}
}
