package com.human.dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
public class UpdateByDynamicJql {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("hum");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		String qry="update Human set hname=:name, location=:loc where hid=:id";
		Query query = manager.createQuery(qry);
		query.setParameter("name", args[0]);
		query.setParameter("loc", args[1]);
		query.setParameter("id", Integer.parseInt(args[2]));
		int executeUpdate = query.executeUpdate();
		System.out.println(executeUpdate);
		transaction.commit();
	}
}
