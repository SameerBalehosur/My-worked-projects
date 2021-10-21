package com.te.assignentanilma;
import java.io.Serializable;
import lombok.Data;
@Data
public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("Dog is eating--");
	}

	@Override
	public void hunt() {
		System.out.println("Dog is hunting--");

	}

	@Override
	public void sleep() {
		System.out.println("Dog is sleeping--");

	}

}
