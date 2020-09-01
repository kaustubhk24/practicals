<!DOCTYPE html>
<html>
<head>
    <title></title>
</head>
<body>
    <center><br>
        <form action="<?php echo $_SERVER['PHP_SELF']; ?>"   method="POST">
            <h1>Enter Marks</h1><br>
        <input type="text" name="marks"><br><br>
        <input type="submit" name="submit">
    </center>

</form>
</body>
</html>

<?php


if (isset($_POST['submit']))

{
  $cat=" ";
 $marks = $_POST['marks'];

if($marks==0)
    $cat="Ab";
elseif(1<=$marks and $marks<=10 )
    $cat="Pp";
elseif(11<=$marks and $marks<=15)
    $cat="Rt";
elseif(16<=$marks and $marks<=20)
    $cat="Gp";
elseif(20<=$marks and $marks<=25)
    $cat="O";
else{
    $cat="default";
}

    showGrade($cat);

}

function showGrade($cat)
{
switch($cat)
{
    case "Ab":echo 'You were absent for examinations';
        break;
    case "Pp":echo 'Your performance is poor.Solve paper again & submit';
        break;
    case "Rt":echo 'You have scored less.Appear for retest!';
        break;
    case "Gp":echo 'You have done good,but can do better';
        break;
    case "O":echo 'Outstanding performance';
    break;
    default:echo'Enter valid input';
        break;
        
       
}

}


?>
