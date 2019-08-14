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


@Entity
@Table(name="Questions")
public class QuestionBean 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int qid;
	
	@Column
	private String qstn;
	
	@Column
	private String op1;
	
	@Column
	private String op2;
	
	@Column
	private String op3;
	
	@Column
	private String op4;
	
	@Column
	private String ans;
	
	private int eid;
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="qid")
	List<StudentExamBean> studentExamBean;
	
	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQstn() {
		return qstn;
	}

	public void setQstn(String qstn) {
		this.qstn = qstn;
	}

	public String getOp1() {
		return op1;
	}

	public void setOp1(String op1) {
		this.op1 = op1;
	}

	public String getOp2() {
		return op2;
	}

	public void setOp2(String op2) {
		this.op2 = op2;
	}

	public String getOp3() {
		return op3;
	}

	public void setOp3(String op3) {
		this.op3 = op3;
	}

	public String getOp4() {
		return op4;
	}

	public void setOp4(String op4) {
		this.op4 = op4;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	
	/*
	 * public ExamBean getExambean() { return exambean; }
	 * 
	 * public void setExambean(ExamBean exambean) { this.exambean = exambean; }
	 */

	}
