package com.practice.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.Search;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.practice.entity.Student;

public class LuceneEngineTest {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(LuceneEngineTest.class);
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class);
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			FullTextSession fullTextSession = Search.getFullTextSession(session);
			fullTextSession.createIndexer().startAndWait();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sessionFactory.close();
		}

	}
}
