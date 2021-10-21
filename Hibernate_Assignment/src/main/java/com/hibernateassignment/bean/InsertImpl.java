package com.hibernateassignment.bean;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.ibernate_assignment.Student;
public class InsertImpl  {
	public static void main(String[] args) {
		Student student=new Student();
		student.setAge(24);
		student.setGender("male");
		student.setName("Virat");
		student.setRollno(10);
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("std");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(student);
		transaction.commit();

	}
}
