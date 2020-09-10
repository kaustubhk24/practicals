/**
 * Q2 Write a Java program to set the priority of a thread.
 */


public class setPriorityOfThread extends Thread{

    public static void main(String[] args) {

        setPriorityOfThread thread=new setPriorityOfThread();
        System.out.println("Default Priority :"+thread.getPriority());
        thread.setPriority(7); // value 0 to 10
        System.out.println("Changed Priority :"+thread.getPriority());


        

    } 
}