<?PHP

if(isset($_COOKIE['username']))
{
	$username=$_COOKIE['username'];
	echo 'Hello '.$username;
	   

    unset($_COOKIE['username']); 
session_unset();

}
else
{
	echo 'You are unauthorised';
}

?>