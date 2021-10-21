package com.te.anotherprojectspring.more;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SbConfig {
	@Bean(name="book")
	public Book getBook() {
		return new Book() ;
	}
	@Bean(name="student")
	public Student getStudent() {
		return new Student();
	}
}
