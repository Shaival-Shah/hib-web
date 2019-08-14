<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="signupdata" method="post">
	
		<table>
			<caption><h1>Registration</h1></caption>
				<tr>
					<td>FirstName :</td>
					<td><input type="text" name="firstname"></td> 
				</tr>
				
				<tr>
					<td>Email :</td>
					<td><input type="email" name="email"></td>   
				</tr>	
		
				<tr>
					<td>Password :</td>
					<td><input type="password" name="password"></td>   
				</tr>
		
				<tr>
					<td align="center" colspan="2"><input type="submit" value="submit"></td>
				</tr>
				<tr>
					<td colspan="2">Already have an account <a href="login">Login</a></td>
				</tr>
		</table>

	</form>
</body>
</html>