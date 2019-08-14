<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="questiondata" method="post">	
		<table>
				<tr>
					<td>Exam Code :</td>
					<td>
						<select name="eid">
								<option value="1">ABCD</option>
								<option value="2">ABCE</option>
								<option value="3">ABCF</option>
						</select> <br>
					</td>	
				</tr>
				<tr>
					<td>Question :</td>
					<td><input type="text" name="qstn"></td> 
				</tr>
				
				<tr>
					<td>op1 :</td>
					<td><input type="text" name="op1"></td>  
				</tr>	
		
				<tr>
					<td>op2 :</td>
					<td><input type="text" name="op2"></td>  
				</tr>	
		
				<tr>
					<td>op3 :</td>
					<td><input type="text" name="op3"></td>  
				</tr>	
				
				<tr>
					<td>op4 :</td>
					<td><input type="text" name="op4"></td>
				</tr>	
				
				<tr>
					<td>Answer :</td>
					<td><input type="text" name="ans"></td>   
				</tr>	
				
				<td><input type="submit" value="AddQuestion"></td>
		</table>	
	</form>
</body>
</html>