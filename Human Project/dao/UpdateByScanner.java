package com.human.dao;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
public class UpdateByScanner {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the name which you would like to update");
		String name=scanner.next();
		System.out.println("Enter the Location which you would like to update");
		String loc=scanner.next();
		System.out.println("Enter the respective ID");
		int n=scanner.nextInt();

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("hum");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		String qry="update Human set hname=:name, location=:loc where hid=:n";
		Query query = manager.createQuery(qry);
		query.setParameter("name", name);
		query.setParameter("loc", loc);
		query.setParameter("n", n);
		int executeUpdate = query.executeUpdate();
		System.out.println(executeUpdate);
		transaction.commit();
	}
}
