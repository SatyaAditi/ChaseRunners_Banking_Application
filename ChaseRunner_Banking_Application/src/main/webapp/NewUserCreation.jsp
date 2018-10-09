<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New user Creation</title>
</head>
<body>
<form action="adduser" method="post">
Name : <input type="text" name="name"><br>
Password : <input type="password" name="password"><br>
Email : <input type="text" name="email"><br>
<button type="submit">submit</button>

</form>

<h4>Points to remember while signing up</h4><br>
<ol>
<li>Password should be atleast 6 characters.</li>
<li>Email should be unique and belonging to you.</li>
<li>Please fill out the email in proper email format.</li>
</ol>
</body>
</html>