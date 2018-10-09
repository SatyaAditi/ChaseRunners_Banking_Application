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

<title>User Profile</title>
</head>
<body>
<h3 class="font">Welcome ${bu.email}</h3>
<br>
<form action="accountinfo" method="post">
<input type="hidden" value=${bu.email} name="user_email">
<button type="submit">To view account info</button>

</form>



<hr>

<form action="updatedeposit" method="post">
<input type="hidden" value=${bu.email} name="user_email"><br>
Amount to Deposit : <input type="text" name="amount_deposited" ><br>

<button>submit</button>

</form>
<hr>
<form action="updatewithdraw" method="post">
Where are you paying bills : <input type="text" name="reason"><br>
<input type="hidden" value=${bu.email} name="user_email1"><br>
Amount to pay : <input type="text" name="amount_withdrawn"><br>
<button> submit </button>
</form>
<hr>
<h3>If you want to send money to someone</h3>

<form action="send" method="post">

<input type="hidden" value=${bu.email} name="user_email2">
Sender's Account Number : <input type="text" name="saccount_no"><br>
Add amount to send : <input type="text" name="amount"><br>

<button>submit</button>
</form>
<hr>
<form action="index.jsp">
<button>To signout</button>
</form>

</body>


</html>