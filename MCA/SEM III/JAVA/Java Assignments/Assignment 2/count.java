/**
 * Q 1 ) Write a Java program to count strings and integers from an array.
 */


 public class count{

    public static void main(String[] args) {
        
        String arr[]={"Pokemon","22","11","33","Raj"};
        int countNumber=0,countString=0;
        
        for(int i=0; i<arr.length; i++)
		{
			try
			{
				int j=Integer.parseInt(arr[i]);
				countNumber++;
			}
			catch(NumberFormatException e)
			{
				countString++;
			}
        }

        System.out.println("Number of Strings in array :"+(countString));
        System.out.println("Number of Integers in array :"+(countNumber));

        
    }

 }