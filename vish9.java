import java.util.Scanner;
public class vish9 
{
 public static void main(String[] args) 
 {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the required number");
    int a = sc.nextInt();

 if (a%2==0) {
        System.out.println(a + " is divisible by 2");
    } 
     if (a%3==0) {
        System.out.println(a + " is disible by 3");
    } 
     if (a%4==0) {
        System.out.println(a +" is divisible by 4");
    }
     if (a%6==0) {
        System.out.println(a + " is divisible by 6");
    }
    sc.close();
 }   
}
