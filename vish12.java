import java.util.Scanner;
public class vish12
{
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
     
        System.out.println("enter the value ");
        int n = sc.nextInt();

        int x = 1;

        for ( int i = 1; i <= n;i++) {
            x = x*i;
        }
        System.out.println(x);
        sc.close();
}
}