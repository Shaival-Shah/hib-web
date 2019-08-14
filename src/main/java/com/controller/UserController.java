package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.ExamBean;
import com.bean.QuestionBean;
import com.bean.StudentExamBean;
import com.bean.UserBean;
import com.dao.UserDao;

@Controller
public class UserController
{
	@Autowired
	UserDao userdao;
	//ExamDao examdao;
	
	@RequestMapping(value="/registration" , method=RequestMethod.GET)
	public String registration() 
	{
		return "Registration";
	}
	
	@RequestMapping(value="/signupdata" , method=RequestMethod.POST)
	public String login(UserBean userbean) 
	{
		userdao.insert(userbean);
		return "Login";
	}
	
	@RequestMapping(value="/login" , method=RequestMethod.GET)
	public String Login() 
	{
		return "Login";
	}

	@RequestMapping(value="/validate" , method=RequestMethod.POST)
	public String Validate(UserBean userbean, HttpServletRequest request)
	{
		
		String sEmail = userbean.getEmail();
		String sPassword = userbean.getPassword();
		System.out.println(sEmail);
		System.out.println(sPassword);
		List<UserBean> list= userdao.checkUser(sEmail,sPassword);
				
			if(!list.isEmpty())
				{
					request.getSession().setAttribute("id",list.get(0).getId());
					return "redirect:/exam";
				}
			return "Login";
				
	}
	
	@RequestMapping(value="/exam" , method=RequestMethod.GET)
	public String exam() 
	{
		return "Exam";
	}
	
	@RequestMapping(value="/addquestion" , method=RequestMethod.GET)
	public String addquestion() 
	{
		return "AddQuestions";
	}
	
	@RequestMapping(value="/questiondata" , method=RequestMethod.POST)
	public String QuestionData(QuestionBean questionbean) 
	{
		userdao.insert(questionbean);
		return "Login";
	}
	
	@RequestMapping(value="/question" , method =RequestMethod.POST)
	public String question(ExamBean exambean,UserBean userbean,Model model)
	{
		
		List<ExamBean> list=userdao.getExam(exambean);
		int id = list.get(0).getEid();
		List<QuestionBean> list1 = userdao.questionpaper(id);
		model.addAttribute("user",userbean);
		model.addAttribute("exam",list.get(0));	//id wali full row
		model.addAttribute("question",list1);       //Total number of questions.
		return "Question";
//		model.addAttribute("exam",exambean);
		//userdao.insert1(exambean);
		
	}
	
	@RequestMapping(value = "/result" ,method = RequestMethod.POST)
	public String result(HttpServletRequest request,StudentExamBean studentExamBean)
	{
		int marks = 0;
		
		String ans[] = new String[2];
		for (int i = 0; i < 2; i++) {
			int j = i+1;
			ans[i]=(String) request.getParameter("Question"+j);
			//System.out.println("Answer is ================" +ans[i]);
		}
		
		int que[] = new int[2];
		for (int i = 0; i < 2; i++) {
			int j = i+1;
			que[i]=Integer.parseInt(request.getParameter("qid"+j));
			System.out.println("Qid =====" +que[i]);
		}
		
		int eid = Integer.parseInt(request.getParameter("eid"));
		System.out.println("Eid " +eid);
		
		List<QuestionBean> list  = userdao.getQuestionPaper(eid);
			
		for (int i = 0; i < list.size(); i++) 
		{
			if(list.get(i).getAns().equals(ans[i]))
			{
				marks++;		
			}
			
		//	System.out.println("Marks ====================" +marks);
		}
		String status = "";
//		System.out.println("marks before if : "+marks);
		if(marks>=(list.size()/2))
		{
			System.out.println("pass");
			status="PASS";
		}
		else
		{
			System.out.println("fail");
			status="FAIL";
		}
		
	
		int id = Integer.parseInt(request.getSession().getAttribute("id").toString());
		System.out.println("SID "+ id);
		
		for (int i = 0; i < ans.length; i++)
		{
			studentExamBean.setAnswer(ans[i]);
			studentExamBean.setStatus(status);
			studentExamBean.setId(id);
			studentExamBean.setQid(que[i]);
			studentExamBean.setEid(eid);
			
			userdao.insertexam(studentExamBean);
			System.out.println("inside");
			
		
		}
				
		return "result";
	}
	
}
