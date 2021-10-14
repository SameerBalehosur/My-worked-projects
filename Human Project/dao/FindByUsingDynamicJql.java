package com.human.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.human.bean.Human;

public class FindByUsingDynamicJql {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("hum");
		EntityManager manager=factory.createEntityManager();
		String qry="from Human where  hid=:id ";
		Query query = manager.createQuery(qry);
		query.setParameter("id", Integer.parseInt(args[0]));
		Human human= (Human) query.getSingleResult();
		System.out.println(human);

	}

}
