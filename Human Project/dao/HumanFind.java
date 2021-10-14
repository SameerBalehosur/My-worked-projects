package com.human.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.human.bean.Human;

public class HumanFind {
	public static void main(String[] args) {
		Human human=new Human();

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("hum");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		human=manager.find(Human.class,2);
		manager.detach(human);
		//	human.setHname("Yeddi");
		manager.merge(human);
		manager.remove(human);
		//	human=manager.find(Human.class,1);
		System.out.println(human);
		System.out.println("Data detaching in the Human table");
		transaction.commit();
	}
}
