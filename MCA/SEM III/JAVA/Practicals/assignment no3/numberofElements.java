/**
 * 
 *Q  5. Write a Java program to get the number of elements in a hash set.
 */

 import java.util.*;

public class numberofElements {

    public static void main(String[] args) {
        
        HashSet<String> hashSet = new HashSet<String>();

        hashSet.add("A");
        hashSet.add("B");

        System.out.println("Hashset size is "+hashSet.size());

        hashSet.add("C");

        System.out.println("Hashset size is "+hashSet.size());


    }
    
}
