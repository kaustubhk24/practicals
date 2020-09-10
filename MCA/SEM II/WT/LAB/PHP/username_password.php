<?PHP

if(isset($_POST['username']) && isset($_POST['password']))
{
	$username=$_POST['username'];
	$password=$_POST['password'];
	
	if($username=='kaustubh' && $password=='kaustubh')
	{
		SESSION_START();
		setcookie("username", $username);
		header("Location: success.php"); 
        exit; 
	}
	else
	{
		echo "<script>alert('Login failed');</script>";
	}
	
	
	
}
?>

<html>
<head></head>
<body>
<center><h1>Login Now</h1>
<br><br>

<form method="post" action="<?php echo $_SERVER['PHP_SELF']; ?>">

Username <br>
<input type="text" name="username">
<br><br>
Password<br>
<input type="password" name="password">
<br><br>
<input type="submit" name="login" text="Login">	
</form>


</center>


</body>






</html>






