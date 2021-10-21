package com.springproject.bean;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
//@AllArgsConstructor
public class Person implements Serializable {
	public Person(Address address) {
		super();
		this.address = address;
	}
	private int id;
	private String name;
	private Address address;
}
