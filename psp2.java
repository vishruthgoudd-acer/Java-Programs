import java.util.Scanner;
public class psp2 
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner (System.in);
       System.out.println("enter the first value");
       int a = sc.nextInt();
       
       int b = a ;
       System.out.println("\n after '=' assignment:"+b);
        b += 10;
        System.out.println("after '+='(add 10) : "+b);

        b -= 5;
        System.out.println("after '-=' (subtract 5) : "+b);

        b *= 2;
        System.out.println("after '*=' (multiply 2) : "+b);

        b /= 3;
        System.out.println("after '/=' (divide by 3) : "+b);
        
        b %= 4;
        System.out.println("after '%=' (modulus by 4) : "+b);

        sc.close();
    }
}
