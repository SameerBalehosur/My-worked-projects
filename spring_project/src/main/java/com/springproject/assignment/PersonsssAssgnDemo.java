package com.springproject.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonsssAssgnDemo {
public static void main(String[] args) {
	ApplicationContext  context=new ClassPathXmlApplicationContext("asgnmnt.xml");
	Address interf = (Address) context.getBean("psn");
	System.out.println(interf);
}
}
/*<bean class="com.springproject.assignment.Personss" id="psn">
<property name="id" value="100" />
<property name="name" value="Virat" />
<property name="hno" value="345" />
<property name="address"/>
</bean>*/
