import java.util.Scanner;
public class jp23 {
    static int sum(int n){
        if (n==0){
            return 0;
        }
         return n + sum(n-1);
    }
         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The sum of numbers from 1 to " + n + " is: " + sum(n));
    }
    
}
