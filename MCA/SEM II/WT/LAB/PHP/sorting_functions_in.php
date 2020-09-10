<?php
$age = array(15,4,22,2,28,99,256,3);
 echo '<br>Original Array ';
 printArray($age);
 
 sort($age);
 echo 'After using sort  ';
 printArray($age);

 
 $age = array(15,4,22,2,28,99,256,3);
 echo '<br>Original Array ';
 printArray($age);
 
  rsort($age);
 echo 'After using rsort  ';
 printArray($age);
 
 $age = array(15,4,22,2,28,99,256,3);
 echo '<br>Original Array ';
 printArray($age);
 
  asort($age);
 echo 'After using asort  ';
 printArray($age);
 
 $age = array(15,4,22,2,28,99,256,3);
 echo '<br>Original Array ';
 printArray($age);
 

 
  ksort($age);
 echo 'After using ksort  ';
 printArray($age);
 
 $age = array(15,4,22,2,28,99,256,3);
 echo '<br>Original Array ';
 printArray($age);
 
  arsort($age);
 echo 'After using arsort  ';
 printArray($age);
 
 $age = array(15,4,22,2,28,99,256,3);
 echo '<br>Original Array ';
 printArray($age);
 
  krsort($age);
 echo 'After using krsort  ';
 printArray($age);
 
 function printArray($arrayName)
 {
	 for($i=0;$i<count($arrayName);$i++)
	 {
		 echo $arrayName[$i].' ';
	 }
	 echo '<br>';
	 
	 
 }
?>