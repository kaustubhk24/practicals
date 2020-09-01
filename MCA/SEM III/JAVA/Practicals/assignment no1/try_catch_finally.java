/**
Write a Java program to use the try and catch and finally block.
 */

public class ExceptionHandling {
    public static void main(String[] args) {
       try {
          int i = 10/0; 
       }
       
       catch(Exception ex){
          System.out.println("Catch Block Called");
       }
      
       finally {
          System.out.println("Finally Block");
       }
    }
 }