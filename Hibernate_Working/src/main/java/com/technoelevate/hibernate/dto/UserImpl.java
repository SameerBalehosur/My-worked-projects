package com.technoelevate.hibernate.dto;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.technoelevate.hibernate.dao.User;

public class UserImpl {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the id");
		int id=scanner.nextInt();
		System.out.println("Enter the name");
		String nam=scanner.next();
		System.out.println("Enter the address");
		String addr=scanner.next();
		System.out.println("Enter the contact number");
		long cnt=scanner.nextLong();
		
		User user=new User();
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("us");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		String qry="insert into user values(id=:uid,name=:nam,address=:addr,contactno=:cnt)";
		 Query query = manager.createQuery(qry);
		 int i = query.executeUpdate();
		manager.persist(i);
//		manager.persist(qry);
		transaction.commit();

	}

}
