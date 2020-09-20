import java.util.Scanner;

class large
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Please First Number ");
        int a = sc.nextInt();
        System.out.println("Please Second Number ");
        int b = sc.nextInt();
        System.out.println("Please Third Number ");
        int c = sc.nextInt();

        int ans;

      



        if(a>b && a>c)
        {
            ans=a;
        }
        else if(b>c && b>a)
        {
            ans=b;
        }
        else
        {
            ans=c;
        }
        System.out.print("Largest Number is " + ans);
    }
}