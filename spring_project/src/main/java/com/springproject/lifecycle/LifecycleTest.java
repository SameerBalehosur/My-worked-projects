package com.springproject.lifecycle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleTest {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("lifecycle.xml");
		LifeCycle bean = (LifeCycle) context.getBean("cycle");
		context.registerShutdownHook();
		System.out.println(bean);
	}
}
