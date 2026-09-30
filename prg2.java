import java.util.Scanner;
public class prg2 
{
    public static void main (String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the integer");
        int n = sc.nextInt();
        if (n%2==0) {
            System.out.println("even number");
        }
        else
            {
                System.out.println("odd number");
            }
    }
    
}
