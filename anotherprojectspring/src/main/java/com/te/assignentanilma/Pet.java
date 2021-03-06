package com.te.assignentanilma;

import java.io.Serializable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class Pet implements Serializable,InitializingBean {
	private int pid;
	@Autowired
	private Animal animal;
	@Override
	public void afterPropertiesSet() throws Exception {
		animal.eat();
		animal.hunt();
		animal.sleep();
	}




}
