<%@page import="com.bean.ExamBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="result" method="post" commandUser="user">
		<table border="4">
					
			<caption><h1>Exam Paper</h1></caption>
				<tr>
					<td><b>Title</b> :${exam.title}</td>
					  
					<td><b>Date</b> :${exam.date}</td>
					  
					<td><b>Duration</b> :${exam.duration}</td>
					  
					<td><b>Marks</b> :${exam.marks}</td>
					  
					<td><b>eCode</b> :${exam.ecode}</td>
				</tr> 
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr>
						<th>Question</th>
						<th colspan="4">Answer</th>
				</tr>
					 
					 <c:forEach items="${question}" var="ques">
					 <c:set var="i" value="${i+1 }"></c:set>
					 
					 <tr>
					 	<td>Question <c:out value="${i}" /></td>
					 	<td colspan="4">${ques.qstn}</td>
					 </tr>
					 
					 
					<tr>
							<td><input type="radio" name="<c:out value="Question${i}"/>" value="${ques.op1}" >${ques.op1}</td>
							<td><input type="radio" name="<c:out value="Question${i}"/>" value="${ques.op2}" >${ques.op2}</td>
							<td><input type="radio" name="<c:out value="Question${i}"/>" value="${ques.op3}" >${ques.op3}</td>
							<td><input type="radio" name="<c:out value="Question${i}"/>" value="${ques.op4}" >${ques.op4}</td>
							<td><input type="text" name="<c:out value="qid${i}"/>" value="${ques.qid}">
							<input type="text" name="<c:out value="eid"/>" value="${exam.eid}"></td>
						
					</tr>
					
					</c:forEach>
					<tr></tr>
					<tr></tr>
					<tr></tr>
					<tr>
							<td colspan="5" align="center"><input type="submit" value="Submit"></td>
					</tr>
		</table>
	</form>
</body>
</html>