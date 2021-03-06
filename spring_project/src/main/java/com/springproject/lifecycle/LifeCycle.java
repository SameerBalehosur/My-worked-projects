package com.springproject.lifecycle;
import java.io.Serializable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycle implements Serializable,InitializingBean,DisposableBean {
	private int id;
	private String name;

	public void init() {
		System.out.println("This is lifecycle init");
	}
	@Override
	public String toString() {
		return "LifeCycle [id=" + id + ", name=" + name + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void destroyee() {
		System.out.println("This is lifecycle destroy");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("This is lifecycle afterPropertiesSet");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("This is lifecycle destroy");
	}
}
