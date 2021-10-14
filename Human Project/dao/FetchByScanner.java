package com.human.dao;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.human.bean.Human;
public class FetchByScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter id to fetch all the records");
		int n=scanner.nextInt();

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("hum");
		EntityManager manager=factory.createEntityManager();

		String qry="from Human";
		Query query = manager.createQuery(qry);
		List list = query.getResultList();
		System.out.println(list);
		for (Object object : list) {
			System.out.println(object);
		}
	}

}
