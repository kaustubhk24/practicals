<?PHP

error_reporting(E_ERROR | E_PARSE);

$day=date('l');

switch($day)
{
	case Monday:msg(1);
		break;
	case Tuesday:msg(2);
		break;
	case Wednesday:msg(3);
		break;
	case Thursday:msg(4);
		break;
	case Friday:msg(5);
		break;
	case Saturday:msg(6);
		break;
	case Sunday:msg(7);
		break;
		
	
}


function msg($param)
{
	switch($param)
	{
		case 1:echo 'Best of luck';
		break;
		case 2:echo 'You are ready for the week';
		break;
        case 3:echo 'Mid week is here';
		break;	
		case 4:echo 'Keep it up';
		break;
		case 5:echo 'Thank God it is Friday';
		break;
		
		default:echo 'Finally its weekend!';
		break;
		
		
		
		
		}
	
	
}



?>