
/**
Write a Java program to find the second smallest element in an array.
 */



public class SecondSmallestInArray{  
public static int getSecondSmallest(int[] a, int total){  
int temp;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[1];
}  
public static void main(String args[]){  
int a[]={1,2,5,6,3,2};  
System.out.println("Second smallest: "+getSecondSmallest(a,6));  
}}