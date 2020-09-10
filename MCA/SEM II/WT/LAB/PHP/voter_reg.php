<?PHP

if(isset($_POST['age']))
{
	$age=$_POST['age'];
	
	try
	{
		if($age<18)
		{
			throw new Exception('UNDERAGE_EXCEPTION');
		}
		else
		{
			echo 'eligilble for register';
			
		}
	}catch(EXCEPTION $e)
	{
		echo $e;
	}
	
	
}



?>





<html>
<head></head>
<body>
<center><h1>REgister</h1>
<br><br>

<form method="post" action="<?php echo $_SERVER['PHP_SELF']; ?>">

Name <br>
<input type="text" name="username">
<br><br>
Age<br>
<input type="text" name="age">
<br><br>
<input type="submit" name="REgister" text="Login">	
</form>


</center>


</body>






</html>






