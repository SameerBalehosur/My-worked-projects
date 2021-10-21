package com.springproject.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springproject.bean.Student;

public class StudentTest {

	public static void main(String[] args) {
		ApplicationContext  context=new ClassPathXmlApplicationContext("stdconfig.xml");
		Student student= (Student) context.getBean("std");
		System.out.println(student);
	}

}
