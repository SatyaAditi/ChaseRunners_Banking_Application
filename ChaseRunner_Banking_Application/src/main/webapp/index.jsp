<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>

body{
 background:url(images/bankimage.jpg) no-repeat center center fixed;
        background-size: cover;
        -webkit-background-size: cover;
        -moz-background-size: cover;
        -o-background-size: cover;
        margin: 0;
        padding: 0;
        }
</style>
<title>ChaseRunners:HomePage</title>
</head>
<body>
<h1 >  Welcome to ChaseRunners Banking Application </h1><br>

<hr>
<h3>Already have an account,please sign in</h3>
<form action="signin" method="post">

Email : <input type="text" name="email"><br>
Password : <input type="password" name="password"><br>
<button type="submit">submit</button>

</form>
<hr>

<h3>Or Sign Up</h3>
<form action="NewUserCreation.jsp">

<button type="submit">SignUp</button>
</form>

</body>
</html>