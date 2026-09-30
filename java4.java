import java.util.Scanner;
public class java4 
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();

        do {
            System.out.println("menu shown once : ");
            System.out.println("choice is "+ a);
        } while (a<9) ;
        sc.close();
    }
    
}
