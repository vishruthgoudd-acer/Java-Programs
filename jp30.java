import java.util.Scanner;
public class jp30 
{
    static int gcd(int a, int b) 
    {
        if (b == 0) 
        {
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("The GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }
    
}
