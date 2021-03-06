package com.te.anotherspring.examples;
import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component("emp")
public class Employe implements Serializable {
	@Value("10")
	private int id;
	@Value("Sameer")
	private String name;
	@Autowired
//	@Qualifier("add")
	private Address address;
	
	
	public Employe(Address address) {
		super();
		this.address = address;
	}

	public void getDetails() {
		System.out.println("Getting address");
	}
}
