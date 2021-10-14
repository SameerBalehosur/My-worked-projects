package com.human.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.human.bean.Human;

public class FindAllJpqImpl {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("hum");
		EntityManager manager=factory.createEntityManager();
		String findall="from Human";
		Query query = manager.createQuery(findall);
		List<Human> list =query.getResultList();
		System.out.println(list);
		for (Human human : list) {
			System.out.println(human);
		}

	}

}
