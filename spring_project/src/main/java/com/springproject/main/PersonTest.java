package com.springproject.main;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springproject.bean.Person;

public class PersonTest {

	public static void main(String[] args) {
		BeanFactory factory=new ClassPathXmlApplicationContext("check.xml");
		Person person= (Person) factory.getBean("psn");
		System.out.println(person);
	}

}
