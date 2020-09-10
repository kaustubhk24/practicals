/**
 * Q 2. Write a Java program to compare two hash sets.
 * 
 */



import java.util.*;

public class compareHash {

   public static void main(String[] args) {

    HashSet<String> hash1 = new HashSet<String>();
    HashSet<String> hash2 = new HashSet<String>();

    hash1.add("A");
    hash1.add("B");
    hash1.add("C");

    hash2.add("A");
    hash2.add("B");

    if(hash1.equals(hash2))
    {
        System.out.println("Both hash are equal ");
    }
    else
    {
        System.out.println("Not Equal ");

    }

    hash2.add("C");

    if(hash1.equals(hash2))
    {
        System.out.println("Both hash are equal ");
    }
    else
    {
        System.out.println("Not Equal ");

    }
       

   }
    
}
