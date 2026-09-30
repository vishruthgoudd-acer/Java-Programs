import java.util.Scanner;
public class psp6
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = 10;
        System.out.println("original x value : "+a);
        System.out.println("post increament : "+a++);
        System.out.println("now a :  "+a);
        System.out.println("pre increament : "+ ++a);
        System.out.println("now a : "+a);
        System.out.println("post decreament : "+a--);
        System.out.println("now a : "+a);
    }
}
