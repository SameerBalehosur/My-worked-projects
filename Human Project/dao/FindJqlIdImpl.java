package com.human.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.human.bean.Human;

public class FindJqlIdImpl {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("hum");
		EntityManager manager=factory.createEntityManager();
		String findall="from Human where hid=3";
	Query query=manager.createQuery(findall);
//	List<Human> list=query.getResultList();
//	System.out.println(list);
	
	
	Human human= (Human) query.getSingleResult();
	System.out.println(human);
	
		

	}

}
