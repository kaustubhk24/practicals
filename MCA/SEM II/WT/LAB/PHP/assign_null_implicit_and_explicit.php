<?PHP
$a;// if we dont assign value then it's NULL

$type=gettype($a);
echo $type;

$b=550;

echo '<br>'.$b;

unset($b);//we can also use unset to make it null

$type2=gettype($b);
echo $type2;






?>