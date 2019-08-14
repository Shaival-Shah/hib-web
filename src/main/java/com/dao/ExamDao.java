package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.bean.ExamBean;

public class ExamDao 
{
		@Autowired
		SessionFactory sessionFactory;
		
		public void insert(ExamBean exambean)
		{
			Session session = sessionFactory.openSession();
			session.save(exambean);
			session.close();
		}
}
