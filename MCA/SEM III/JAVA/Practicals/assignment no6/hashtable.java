

/**
 * Q 1) Write an implementation of hash tables from scratch. Define the following
 *  methods: get(key), put( key, value ), remove(key), containsKey (key), and
 *  size().
 */

import java.util.HashMap;

 public class hashtable
 {

    public static void main(String[] args) {

        HashMap hashMap=new HashMap<>();

        //put(key,value)
        hashMap.put(1,"Kaustubh");
        hashMap.put(2,"Mahesh");
        hashMap.put(3,"Angad");
        hashMap.put(4,"Sagar");

        //printing complete HashMap
        System.out.println(hashMap);

        //get(key) method

        System.out.println(hashMap.get(1));

        //remove(key)

        hashMap.remove(3);
        System.out.println(hashMap);

        //contains(key)

        System.out.println(hashMap.containsKey(3)); //false
        System.out.println(hashMap.containsKey(1));//True

       //size

       System.out.println(hashMap.size());
        
    }
 }