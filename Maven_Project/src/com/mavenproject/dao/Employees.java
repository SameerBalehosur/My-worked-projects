package com.mavenproject.dao;
public class Employees implements Books {

	@Override
	public  void sql() {
		System.out.println("Tech employees using sql notes");
	}

	@Override
	public void java() {
		System.out.println("Tech employees using java notes");
	}

	@Override
	public void jdbc() {
		System.out.println("Tech employees using jdbc notes");
	}

}
