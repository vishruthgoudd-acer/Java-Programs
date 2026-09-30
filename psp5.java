import java.util.Scanner;
public class psp5 
{
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter name");
    String name = sc.nextLine();

    System.out.println("enter age ");
    int age = sc.nextInt();

    System.out.println("name : "+ name);
    System.out.println("age : "+ age);
    sc.close();
 }   
}
