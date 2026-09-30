import java.util.Scanner;
public class square 
{
    static int square(int n) {
        return n*n;
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();

        int results = square(n);
        System.out.println("square = "+results);
        sc.close();
    }
    
}
