package com.springproject.bean;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
//@AllArgsConstructor
public class AutowireByCons implements Serializable {
public AutowireByCons(Address address) {
		super();
		this.address = address;
	}
private int id;
private Address address;

}
