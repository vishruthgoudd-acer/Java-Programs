import java.util.Scanner;
public class psp10 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a = 10000;

        System.out.println("enter the deposit amount ");
        int b = sc.nextInt();
        
        System.out.println("the total bank balance after deposition");
        b += a ;
        System.out.println(b);
        sc.close();
    }
    
}
