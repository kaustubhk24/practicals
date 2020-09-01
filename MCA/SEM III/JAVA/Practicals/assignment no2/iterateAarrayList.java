
/**
 * Q3 . Write a program to traverse (or iterate) ArrayList?
 */

 import java.util.*;

public class iterateAarrayList {

    public static void main(String[] args) {

    List<Integer> NumberList =  Arrays.asList(25,13,15,25,88,15);

    for(int i=0;i<NumberList.size();i++)
    {
        System.out.print(NumberList.get(i) + " ");         
    }
        
    }

    
    
}