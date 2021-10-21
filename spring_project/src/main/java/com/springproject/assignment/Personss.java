package com.springproject.assignment;
import java.io.Serializable;
import lombok.Data;
@Data
public class Personss implements Serializable {
	private int id;
	private String name;
	private String hno;
	Address address;


}
