import java.util.Scanner;
public class prg4
{
public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    double pi = 3.14;
    System.out.println("enter the radius");
    double radius = sc.nextDouble();

    double area = pi*radius*radius;

    System.out.println("the area of the circle is : " + area);
    sc.close();
  }
}