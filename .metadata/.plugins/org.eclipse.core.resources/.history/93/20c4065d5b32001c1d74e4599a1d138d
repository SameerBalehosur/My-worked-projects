package com.te.fullannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTestDeemo {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(PersonConfig.class);
		Person bean2 = context.getBean(Person.class);
		bean2.getDetails();
		System.out.println(bean2);
	}
//
}
