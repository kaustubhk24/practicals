import java.util.Scanner;
class prime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Please enter number ");
        int num = sc.nextInt();
        //int num = 29;
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

    }
}