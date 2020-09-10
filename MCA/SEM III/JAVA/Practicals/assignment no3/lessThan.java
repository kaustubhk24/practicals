
/**
 * 4. Write a Java program to get an element in a tree set which is strictly
less than the given element
 */

 import java.util.*;

public class lessThan {

    public static void main(String[] args) {

        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(15);
        tree.add(22);
        tree.add(13);


        System.out.println(tree.lower(16)+ " is strictly less than 16");
        
    }
    
}
