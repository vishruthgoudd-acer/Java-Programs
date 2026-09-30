import java.util.Scanner;
public class attreg 
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your attendence");
        double n = sc.nextDouble();
        if (n>=85) {
            System.out.println("eligible for semester exam");
        } else {
            System.out.println("not eligible for semester exam");
        }
        sc.close();
    }
    
}
