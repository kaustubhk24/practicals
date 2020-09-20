/**
 * Q  2) Write a Java program to merge two one dimensional arrays
 */


public class merge {

    public static void main(String[] args) {

        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7,8,9,10};
        int mergedArray[] = new int[10];

        System.out.println("Array 1:\n");
        printArray(arr1);
        System.out.println("Array 2:\n");
        printArray(arr2);
        


        //adding arr1
        for(int i=0;i<arr1.length;i++)
        {
            mergedArray[i]=arr1[i];
        }

        //adding arr2

         for (int i=0 ;i<arr2.length;i++)
         {
             mergedArray[arr1.length+i]=arr2[i];

         }

         //merged array

         System.out.println("Merged array :");
         printArray(mergedArray);




        
    }
    


    public static void printArray(int[] a)
    {
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+"\t");
        }


    }


}
