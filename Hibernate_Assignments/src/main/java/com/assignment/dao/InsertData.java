package com.assignment.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.assignment.bean.Student;

public class InsertData {

	public static void main(String[] args) {
		Student student=new Student();
		
		student.setRollno(10);
		student.setName("Sameer");
		student.setPhoneno(9945663179l);
		student.setLocation("Gadag");
		
		try {
			EntityManagerFactory factory=Persistence.createEntityManagerFactory("stdnt");
			EntityManager manager=factory.createEntityManager();
			EntityTransaction transaction=manager.getTransaction();
			transaction.begin();
			manager.persist(student);
			transaction.commit();
			System.out.println(student);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
