import java.util.Scanner;
public class java2 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = 0;
        int b = 1;

        while (a <=5 ) {
            b += a ;
            a++;
          
        }
           System.out.println(b);
        sc.close();
    }
    
}
