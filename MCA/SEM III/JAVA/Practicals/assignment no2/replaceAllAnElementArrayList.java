/**
 * Q4 Write a program to replace an element in a list using replaceAll()
 */

import java.util.*; 

public class replaceAllAnElementArrayList {

    public static void main(String[] args) {

        List list = Arrays.asList("Apple","Ball","Apple","Cat","Apple","Dog","Egg");
        System.out.println("List Before Replace :"+list);

        Collections.replaceAll(list, "Apple", "REPLACED");

        System.out.println("List After replaceAll: " + list);

        
    }

    
}