package com.te.ibernate_assignment;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Student implements Serializable {
	@Id
	private String name;
	private String gender;
	private int age;
	private int rollno;

}
