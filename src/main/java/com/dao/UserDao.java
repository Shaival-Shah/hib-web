package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.ExamBean;
import com.bean.QuestionBean;
import com.bean.StudentExamBean;
import com.bean.UserBean;

@Repository
public class UserDao
{
		@Autowired
		SessionFactory sessionfactory;
		JdbcTemplate stmt;
		
		public void insert(UserBean userbean)
		{
			Session session = sessionfactory.openSession();
			session.save(userbean);
			session.close();
		}
		
		public List<UserBean> checkUser(String sEmail, String sPassword)
		{
			Session session=sessionfactory.openSession();
			List<UserBean> list=session.createQuery("from UserBean where email = '"+sEmail+"' and  password = '"+sPassword+"' ").list();
			if(list.size()==0)
			{
				return null;
			}
			session.close();
			return list;
			
		}
		
		public List<ExamBean> getExam(ExamBean exambean)
		{
			Session session = sessionfactory.openSession();
			List<ExamBean> list = session.createQuery("from ExamBean where ecode='"+exambean.getEcode()+"'").list();
			session.close();
			return list;
		}
		
		public void insert(QuestionBean questionbean)
		{
			Session session = sessionfactory.openSession();
			session.save(questionbean);
			session.close();
		}

		public List<QuestionBean> questionpaper(int id) {
			Session session = sessionfactory.openSession();
			List<QuestionBean> list = session.createQuery("from QuestionBean where eid='"+id+"'").list();
			session.close();
			return list;
		}

		public void insertexam(StudentExamBean studentExamBean) {
			Session session = sessionfactory.openSession();
			session.save(studentExamBean);
			session.close();
		}

		public List<QuestionBean> getQuestionPaper(int eid) {
			Session session = sessionfactory.openSession();
			List<QuestionBean> list = session.createQuery("from QuestionBean where eid='"+eid+"'").list();
			return list;
		}

		
}
