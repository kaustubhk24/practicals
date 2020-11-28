/**
 * Write a program on Java ArrayList add() Method which is used for adding an element to the specified index. 
 *  */


import java.util.ArrayList;
public class addArray {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Orange");
		System.out.println("Fruits :");
		for (String fruit : fruits) {
	         System.out.println(fruit);
	      }  
		fruits.add(1,"Apple");
		System.out.println("\nFruits:" + fruits);
	}
}
