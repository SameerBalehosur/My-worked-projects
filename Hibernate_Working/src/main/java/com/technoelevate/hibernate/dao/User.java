package com.technoelevate.hibernate.dao;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="Karnataka Users")
public class User implements Serializable {
	@Id
	@Column(name="User Id")
	private int id;
	@Column(name="User Name")
	private String name;
	@Column(name="Address")
	private String address;
	@Column(name="Contact")
	private long contactno;
	

}
