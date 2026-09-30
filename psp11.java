import java.util.Scanner;
public class psp11 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter candidates name ");
        String name = sc.next();

        System.out.println("enter total percentage ");
        double per = sc.nextDouble();

        String re = (per >= 75)? "eligible for scholarship" : "not eligible for scholarship";

        System.out.println(re);
        sc.close();


    }
    
}
