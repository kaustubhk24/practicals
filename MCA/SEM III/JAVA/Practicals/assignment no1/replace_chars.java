/**
Write a Java program to replace all the 'd' characters with 'f' characters.
Input : “The quick brown fox jumps over the lazy dog”
 */


 public class replace {
    
   public static void main(String[] args)
    {
        String str = "The quick brown fox jumps over the lazy dog.";

        String new_str = str.replaceAll("d", "f");
       
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);
    }
}
