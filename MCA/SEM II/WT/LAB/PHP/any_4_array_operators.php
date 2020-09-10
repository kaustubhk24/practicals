<?PHP


$a = array("a" => "apple", "b" => "banana");
$b = array("a" => "pear", "b" => "strawberry", "c" => "cherry");

echo 'array a';
 var_dump($a);

echo '<br>array b';
 var_dump($b);

echo '<br>Union Operator';
 var_dump($a+$b);  

echo '<br>Equality Operator';
 var_dump($a==$b);  

echo '<br>Identity 	Operator';
 var_dump($a===$b);


echo '<br>Not identical	Operator';
 var_dump($a!==$b);
?>