package com.te.fullannotations;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component()
public class Person implements Serializable {
	@Value("10")
	private int id;
	@Value("Sameer")
	private String name;
	@Autowired
	private Address address;


	public  void getDetails() {
		address.getAdd();
		System.out.println("These are persons info---");
	}
}
