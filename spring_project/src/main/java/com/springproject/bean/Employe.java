package com.springproject.bean;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
//@AllArgsConstructor
public class Employe implements Serializable {
	private int phone;
	private double sal;
	
	public Employe(int id, int name) {
		this.sal = id;
		this.phone = name;
		System.out.println("constructor");
	}
	public Employe(double sal, int phone) {
		this.sal = sal;
		this.phone = phone;
		System.out.println("constructor");
	}
	public Employe(String sal, int phone) {
		this.sal = Integer.parseInt(sal);
		this.phone = phone;
		System.out.println("String constructor");
	}
	
}
