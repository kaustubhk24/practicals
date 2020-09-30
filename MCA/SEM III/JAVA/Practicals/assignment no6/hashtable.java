

/**
 * Q 1) Write an implementation of hash tables from scratch. Define the
 * following methods: get(key), put( key, value ), remove(key), containsKey
 * (key), and size().
 */


import java.util.Hashtable;
 
 public class hashtable
 {

    public static void main(String[] args) {

        Hashtable hashTable=new Hashtable<>();

        //put(key,value)
        hashTable.put(1,"Kaustubh");
        hashTable.put(2,"Mahesh");
        hashTable.put(3,"Angad");
        hashTable.put(4,"Sagar");

        //printing complete hashTable
        System.out.println(hashTable);

        //get(key) method

        System.out.println(hashTable.get(1));

        //remove(key)

        hashTable.remove(3);
        System.out.println(hashTable);

        //contains(key)

        System.out.println(hashTable.containsKey(3)); //false
        System.out.println(hashTable.containsKey(1));//True

       //size

       System.out.println(hashTable.size());
        
    }
 }