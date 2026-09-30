import java.util.Scanner;
public class cvalidator 
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter day (1=mon,2=tue,3=wed,4=thu,5=fri,6=sat,7=sun) :");
        int day = sc.nextInt();
        int hour = sc.nextInt();
        if (day >=1 && day <= 5) {
           if (hour >1 && hour <17){ 
            System.out.println("registration allowed");
        } else {
            System.out.println("registration closed - outside hours");
        }
    } else {
        System.out.println("registration closed - weekend");
    }
        sc.close();
    }
}