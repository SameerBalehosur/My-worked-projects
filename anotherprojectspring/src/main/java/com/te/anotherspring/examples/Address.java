package com.te.anotherspring.examples;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
//@Component
public class Address {
//	@Value("Gadag")
	private String city;
//	@Value("India")
	private String country;

}
