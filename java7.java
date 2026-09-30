import java.util.Scanner;
public class java7 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the attendence percentage ");
        int a = sc.nextInt();

        if (a >= 75) {
            System.out.println("eligible");
        } else {
            System.out.println("not eligible");
        }
        sc.close();
    }
    
}
