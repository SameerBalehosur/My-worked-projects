package com.springproject.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springproject.bean.ProtoTypeScope;

public class ProtoTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("proto.xml");
		ProtoTypeScope bean = (ProtoTypeScope) context.getBean("pro");
		System.out.println(bean.hashCode());

		ProtoTypeScope bean1 = (ProtoTypeScope) context.getBean("pro");
		System.out.println(bean1.hashCode());
	}

}
