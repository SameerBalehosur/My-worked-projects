package com.springproject.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springproject.bean.SingletonBean;

public class SingletonTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("singleton.xml");
		SingletonBean bean = (SingletonBean) context.getBean("single");
		System.out.println(bean.hashCode());
		
		SingletonBean bean1 = (SingletonBean) context.getBean("single");
		System.out.println(bean1.hashCode());
	}

}
