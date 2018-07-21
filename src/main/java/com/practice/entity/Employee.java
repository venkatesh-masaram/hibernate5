package com.practice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

import org.hibernate.annotations.Check;

@Entity
@Check(constraints = "salary is not null and salary > 10000")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "tb_gen")
	@TableGenerator(name = "tb_gen")
	private Long eid;

	private String name;

	@Column(name="salary")
	private Float salary;

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public Long getEid() {
		return eid;
	}

	public void setEid(Long eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
