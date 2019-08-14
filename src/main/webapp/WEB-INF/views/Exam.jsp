<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="question" method="post">
			<table>
				<tr>
					<td>
						<input type="hidden" value="${user.id}">
					</td>
				</tr>
				
				<tr>
					<td>Exam Code :</td>
					<td>
						<select name="ecode">
								<option value="C">ABCD</option>
								<option value="C++">ABCE</option>
								<option value="JAVA">ABCF</option>
						</select> <br>
					</td>	
				</tr>
				
				<tr>
					<td><input type="submit" value="submit"></td>
				</tr>
			
			</table>
	</form>
</body>
</html>



<%-- 
				</tr>
				
				<tr>
					<td>Title :</td>
					<td>
						<select name="title">
								<option value="C">C</option>
								<option value="C++">C++</option>
								<option value="Java">Java</option>
						</select> <br>
					</td>
				</tr>
				
				<tr>
					<td>Date :</td>
					<td><input type="date" name="date"></td> <br>
				</tr>
				
				<tr>
					<td>Marks :</td>
					<td><input type="number" value="50" name="marks"></td> <br>
				</tr>
				
				<tr>
					<td>Duration :</td>
					<td><input type="number" name="duration" value="30"></td> <br>
				</tr>
			
				
			 --%>