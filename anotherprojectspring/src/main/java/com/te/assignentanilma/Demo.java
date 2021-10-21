package com.te.assignentanilma;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AllConfig.class);
		Pet pet= (Pet) context.getBean("pa");
		System.out.println(pet);
		
	}

}
