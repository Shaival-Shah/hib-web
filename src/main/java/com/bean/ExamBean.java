package com.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="UserExam")
public class ExamBean 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	
	@Column
	private String title;
	
	@Column
	private String date;
	
	@Column
	private int marks;
	
	@Column
	private int duration;
	
	@Column
	private String ecode;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="eid")
	List<QuestionBean> questionBeans;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="eid")
	List<StudentExamBean> studentExamBean;
	/*
	 * @OneToMany(cascade=CascadeType.ALL)
	 * 
	 * @JoinColumn(name="eid") List<QuestionBean> questionbean;
	 */
	
	public List<StudentExamBean> getStudentExamBean() {
		return studentExamBean;
	}
	public void setStudentExamBean(List<StudentExamBean> studentExamBean) {
		this.studentExamBean = studentExamBean;
	}
	public List<QuestionBean> getQuestionBeans() {
		return questionBeans;
	}
	public void setQuestionBeans(List<QuestionBean> questionBeans) {
		this.questionBeans = questionBeans;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getEcode() {
		return ecode;
	}
	public void setEcode(String ecode) {
		this.ecode = ecode;
	}
	
}
