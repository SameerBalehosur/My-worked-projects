package com.te.fullannotations;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Address {
	@Value("999")
	private int hno;

	public void getAdd() {
		System.out.println("This is address of persons");
	}
}
