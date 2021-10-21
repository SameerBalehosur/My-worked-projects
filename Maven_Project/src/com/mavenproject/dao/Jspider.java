package com.mavenproject.dao;
public class Jspider implements Books {

	@Override
	public void sql() {
		System.out.println("Jspider people using sql");

	}

	@Override
	public void java() {
		System.out.println("Jspider people using java");

	}

	@Override
	public void jdbc() {
		System.out.println("Jspider people using jdbc");

	}

}
