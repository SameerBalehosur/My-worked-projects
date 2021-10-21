package com.springproject.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireByconstTest {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("autocnst.xml");
		
		Object bean = context.getBean("con") ;
		System.out.println(bean);
	}

}
