package com.mavenproject.dao;
public class TestYantra implements Books {

	@Override
	public void sql() {
		System.out.println("TestYantra people using sql");
	}

	@Override
	public void java() {
		System.out.println("TestYantra people using java");

	}

	@Override
	public void jdbc() {
		System.out.println("TestYantra people using jdbc");

	}

}
