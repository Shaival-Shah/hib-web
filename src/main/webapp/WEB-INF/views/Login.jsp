<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="validate" method="post">
			<table>
				<caption><h1>Login</h1></caption>
				<tr>
					<td>Email :</td>
					<td><input type="email" name="email"></td>  
				</tr>	
				<tr>
					<td>Password :</td>
					<td><input type="password" name="password"></td> 
				</tr>
				
				<td align="center" colspan="2"><input type="submit" value="submit"></td>
				
				<tr>
					<td colspan="2">Already have an account <a href="registration">Registration</a></td>
				</tr>
				
			</table>
	</form>	
</body>
</html>