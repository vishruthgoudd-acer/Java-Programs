import java.util.Scanner;
public class java5 
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter your marks");
        int m = sc.nextInt();

        if (m>=90) {
            System.out.println("A grade");
        } else if (m>=80) {
            System.out.println("B grade");
        } else if (m>= 70) {
            System.out.println("C grade");
        } else {
            System.out.println("not in requirements");
        }
        sc.close();
    }
    
}
