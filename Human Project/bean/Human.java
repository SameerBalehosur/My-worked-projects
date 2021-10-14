package com.human.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="LegendsTable")
public class Human implements Serializable {
	@Id
	private int hid;
	private String hname;
	private long adarano;
	private String location;
}
