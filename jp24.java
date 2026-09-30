import java.util.Scanner;
public class jp24 {
    static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x * power(x,n-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.print("Enter the power: ");
        int n = sc.nextInt();
        System.out.println(x + " raised to the power of " + n + " is: " + power(x,n));
    }
    
}
