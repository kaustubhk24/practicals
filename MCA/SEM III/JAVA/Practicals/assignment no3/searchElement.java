/**
 *  Q1. Write a Java program to search an element in a array list.
 */


import java.util.*;

public class searchElement {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		
		  list.add(12);
		  list.add(52);
		  list.add(63);
		  list.add(45);
		  list.add(58);  
 
		  check(15,list);
		  check(58,list);

	}

	private static void check(int num,ArrayList<Integer> ls)
	{
        if (ls.contains(num)) {
		    System.out.println(num +" Found \n" );
		    } else {
		    System.out.println( num +" Not found \n");
		    }
	}

}