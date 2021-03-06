package com.springproject.main;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springproject.bean.Employe;
public class Demo {

	public static void main(String[] args) {
		//First way using bean factory
		BeanFactory factory=new ClassPathXmlApplicationContext("beans.xml");
		Employe employe = (Employe) factory.getBean("emp");
		System.out.println(employe);
		
		//second way using ApplicationContext
//		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
//		Employe employe2 = (Employe) context.getBean("emp");
//		System.out.println(employe2);
	}

}
