import java.util.Scanner;
public class psp8 
{
    public static void main (String[] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the locker number");
    int lock = sc.nextInt();

    String res = (lock >=1 && lock<= 20)? "valid locker number,locker is detected" : "invalid locker number,locker not detected";
    System.out.println("the locker reslts : "+res);
    sc.close();
   } 
    
}
