import java.util.*;

/**
 * Write a program to remove an element of the specified index from a list
 */


public class removeArray {
    public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>(5); 
		fruits.add("Apple");
		fruits.add("Gauva");
		
        System.out.println("Fruits :" + fruits);   
        fruits.remove(1);   
    
        System.out.println("Final List :" + fruits); 
	}
    
}
