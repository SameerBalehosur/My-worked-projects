package com.te.anotherspring.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Employe bean = (Employe) context.getBean("emp");
		bean.getDetails();
		System.out.println(bean);
	}

}
