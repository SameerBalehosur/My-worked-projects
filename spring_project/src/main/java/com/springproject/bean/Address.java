package com.springproject.bean;
import java.io.Serializable;
import lombok.Data;
@Data
public class Address implements Serializable {
	private int hno;
	private String state;
	private String country;
}
