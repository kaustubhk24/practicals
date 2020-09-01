<!DOCTYPE html>
<html>
<head>
	<title>Variables and scope</title>
</head>
<body>
	<p>We will  see how variables behave as per there scope.</p>
	<?php
	$gblVar=60;
	function m1()
	{
		$lclVar=20;
		static $stcVar=0;
		$gblVar;
		echo "We can not read gblVar here :$gblVar<br>";
		$lclVar++;
		echo "We can read lclVar here:$lclVar<br>";
	}








	?>
</body>
</html>