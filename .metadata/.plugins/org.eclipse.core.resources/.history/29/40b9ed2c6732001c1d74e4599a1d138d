package com.te.anotherprojectspring.more;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(SbConfig.class);
		Student bean = context.getBean(Student.class);
		System.out.println(bean);
	}

}
