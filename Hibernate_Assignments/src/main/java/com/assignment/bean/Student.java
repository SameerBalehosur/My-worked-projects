package com.assignment.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name="StudentInformation")
public class Student implements Serializable {
	@Id
	private int rollno;
	private String name;
	private long phoneno;
	private String location;
}
