/**
 * 
 * 5. Write a program to insert the specified element at the end of this list.
[Tip: use java.util.LinkedList.addLast() ]
 */

import java.util.*;

 public class addInEndOfList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("One");
        list.add("Two");
        list.add("Three");

        System.out.println("List :"+list);

        list.add("Four");

        System.out.println("After Adding Element :"+list);

    }
    
}