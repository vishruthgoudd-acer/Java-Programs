import java.util.Scanner;
public class prg5
{
    public static void main (String[] args) 
    {
        java.util.Scanner sc = new Scanner (System.in);
        System.out.println("enter the first number ");
        int a = sc.nextInt();

        System.out.println("enter the second number ");
        int b = sc.nextInt();

        if (a>b) {
            System.out.println("the first number is the biggest number in the given two numbers");
        } else if (b>a)  {
            System.out.println("the second number is the biggest number in the two numbers");
        }  else {
            System.out.println("both numbers are equal ");
        }
        sc.close();
    }
}