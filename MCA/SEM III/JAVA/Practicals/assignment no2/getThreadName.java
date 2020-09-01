/**
 *   Q1 Write a Java program which shows how to get the name of a running thread?
 */

class getThreadName extends Thread{  
      public static void main(String args[]){  


    getThreadName t=new getThreadName();  
    t.start(); 
    System.out.println("Name of Thread :"+t.getName());  
    t.setName("TEST_NAME");  
    System.out.println("After changing name of t:"+t.getName()); 
    
    
   }  
  }  