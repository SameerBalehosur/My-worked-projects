package com.human.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.human.bean.Human;

public class HumanInsertImpl {

	public static void main(String[] args) {
		Human human=new Human();
		human.setHid(4);
		human.setHname("ABD");
		human.setAdarano(89765896633l);
		human.setLocation("SA");
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("hum");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(human);
		System.out.println("Data inserted successfully in the Human table");
		transaction.commit();

	}

}
