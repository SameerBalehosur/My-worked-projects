package com.te.anotherprojectspring.more;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import lombok.Data;
@Data
public class Student implements Serializable {
	@Value("100")
	private int id;
	@Value("Virat")
	private String name;
	@Autowired
	private Book book;
	
}
