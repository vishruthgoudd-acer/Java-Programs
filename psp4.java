import java.util.Scanner;
public class psp4 
{
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter marks ");
    int a = sc.nextInt();

    String results = (a > 40 )? "PASS":"FAIL";
    System.out.println(results);
 }  
}
