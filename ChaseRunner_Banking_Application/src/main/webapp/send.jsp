<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Send Money</title>
</head>
<body>
<form action="send" method="post">

<input type="hidden" value=${bu.email} name="user_email">
Sender's Account Number : <input type="text" name="saccount_no"><br>
Add amount to send : <input type="text" name="amount"><br>

<button>submit</button>
</form>

</body>
</html>