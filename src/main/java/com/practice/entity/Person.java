package com.practice.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Person {

	@Id
	@GeneratedValue(generator = "hh")
	@SequenceGenerator(name = "hh", sequenceName = "or_person_seq")
	private Integer pid;

	@ElementCollection
	private List<String> phones = new ArrayList<>();

	public List<String> getPhones() {
		return phones;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

}
