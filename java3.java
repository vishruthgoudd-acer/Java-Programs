import java.util.Scanner;
public class java3 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter your number ");
        int a = sc.nextInt();
        int sum = 0;
        for (int i=1;i<=10;i++) {
            System.out.println("the value of i is : "+i);
            sum += i;
        }
        System.out.println("the sum value is : " + sum);
        sc.close();
    }
    
}
