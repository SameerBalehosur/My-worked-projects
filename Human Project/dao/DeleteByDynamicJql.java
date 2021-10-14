package com.human.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteByDynamicJql {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("hum");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		String qry="delete from Human where hid=:id";
		Query query = manager.createQuery(qry);
		query.setParameter("id", Integer.parseInt(args[0]));
		int delete = query.executeUpdate();
		System.out.println(delete);
		transaction.commit();
	}

}
