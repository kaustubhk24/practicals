/**
 * Q 3. Write a Java program to get the first and last elements in a tree set.
 */

import java.util.*;

public class firstLast {

    public static void main(String[] args) {
        
        TreeSet<Integer> tree = new TreeSet<Integer>();

        tree.add(15);
        tree.add(25);


        System.out.println("First is "+tree.first()+" and 2nd is "+tree.last());
    }
    
}
