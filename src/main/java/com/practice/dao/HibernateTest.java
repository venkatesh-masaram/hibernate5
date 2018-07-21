package com.practice.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.practice.entity.Person;
import com.practice.entity.Phone;

public class HibernateTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			Configuration configuration = new Configuration().configure().addPackage("com.practice.entity")
//					.addAnnotatedClass(Student.class);
//					.addAnnotatedClass(Person.class)
					//.addAnnotatedClass(Phone.class)
					.addAnnotatedClass(Person.class);
//					.addAnnotatedClass(Book.class);
			sessionFactory = configuration.buildSessionFactory();
			
			session = sessionFactory.openSession();
			Transaction transaction = session.getTransaction();
			transaction.begin();
			/*Employee employee = new Employee();
			employee.setName("C");*/
			Person person = new Person();
			List<String> phones= new ArrayList<>();
			phones.add("100");
			phones.add("200");
			person.setPhones(phones);
//			phone.setPerson(person);
			session.save(person);
//			session.save(phone);
			/*Person person = session.load(Person.class, 22);
			System.out.println(person.getPhone());*/
			/*Student student = new Student();
			student.setMarks(100f);
			student.setName("BB");
//			student.setPhoneNumber("100-100");
			session.save(student);*/
//			session.save(employee);
			/*Department department = new Department();
			department.setEmpName("Emp1");
			department.setName("Dep1");
			session.save(department);*/
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
			sessionFactory.close();
		}
		
	}
}
