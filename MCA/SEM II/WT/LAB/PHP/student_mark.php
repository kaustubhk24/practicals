<?PHP
if(isset($_POST["num"]) && isset($_POST["roll"]))
{
$grade;
$marks=$_POST["num"];
$roll=$_POST["roll"];


if($marks==0)
{   
    $grade='Ab';
}
elseif(1<=$marks && $marks<=10)
{
    $grade='Pp';
}
elseif(11<=$marks && $marks<=15)
{
    $grade='Rt';
}
elseif(16<=$marks && $marks<=20)
{
    $grade='Gp';
}
elseif(20<=$marks && $marks<=25)
{
    $grade='O';
}
else{
    $grade='DF';
}


switch($grade)
{
    case 'Ab':popUp('You were absent.Meet class coordinator',$marks,$roll);
                break;
    case 'Pp':popUp('Your performance is poor.Solve paper again & submit',$marks,$roll);
                break;
    case 'Rt':popUp('You have scored less.Appear for retest!',$marks,$roll);
                break;
    case 'Gp':popUp('You have done good,but can do better ',$marks,$roll);
                break;
    case 'O':popUp('Outstanding performance!',$marks,$roll);
                break;
    case 'DF':popUp('Please enter valid input',$marks,$roll);
                break;                       
                
    
}

}

function popUp($msg,$marks,$roll)
{
   //echo '<script language="javascript">';
  // echo 'alert("'.$msg.'")';
   //echo '</script>';
  
  
   
	   
  
   var_dump($a);
}




?>





<html>
    <head>
        <title>Enter Marks</title>
    </head>
    <body>
        <center>
            <h1>
           
            </h1>
            <br>
                <form action="<?php echo $_SERVER['PHP_SELF']; ?>" method="post">
     Enter Marks
                  <input type="text" name="num"><br><br>
				  Enter Roll Number
				  <input type="text" name="roll"><br><br>
              <input type="submit" value="Submit" name='submit'/>
                </form>
                
        </center>
    </body>
</html>