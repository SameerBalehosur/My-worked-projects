package com.human.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class HumanUpdateUsingJpql {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("hum");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		String qry="update Human set location='Delhi' where hid=2";
		Query query = manager.createQuery(qry);
		int update = query.executeUpdate();
		transaction.commit();
	}
}
