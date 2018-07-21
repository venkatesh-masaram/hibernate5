package com.practice.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NaturalId;

@Entity(name = "Phone")
public class Phone {

	@Id
	@GeneratedValue
	private Long id;

	@NaturalId
	@Column(name = "`number`")
	private String number;

	@ManyToOne
	private Person person22;

	public Phone() {
	}

	public Phone(String number) {
		this.number = number;
	}

	public Long getId() {
		return id;
	}

	public String getNumber() {
		return number;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Person getPerson() {
		return person22;
	}

	public void setPerson(Person person) {
		this.person22 = person;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", number=" + number + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Phone phone = (Phone) o;
		return Objects.equals(number, phone.number);
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

}