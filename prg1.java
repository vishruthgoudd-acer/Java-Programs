import java.util.Scanner;
public class prg1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the first integer");
        int a = sc.nextInt();
        
        System.out.println("enter the second integer");
        int b = sc.nextInt();

        int sum = (a+b);
        System.out.println("the sum is " + sum);

        sc.close();
    }
}