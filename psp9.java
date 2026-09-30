import java.util.Scanner;
public class psp9 
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner (System.in);

        System.out.println("enter your parcel id ");
        int pid = sc.nextInt();

        System.out.println("enter the reciepient name");
        String name = sc.next();

        System.out.println("enter your mobile number");
        long num = sc.nextLong();

        System.out.println("enter your parcel size");
        String ps= sc.next();
        
         String locker ;

        if (ps.equals("small")) {
            locker = "Locker A";
        } else if (ps.equals("medium")) {
            locker = "locker B";
        } else {
            locker = "locker C";
        }

        System.out.println("enter your parcel weight ");
        double we = sc.nextDouble();

        System.out.println("if express typr true and false elseif ");
        boolean express = sc.nextBoolean();

        double fee = express ? 40 : 20 ;

        int pcd = pid + 5000;

        System.out.println("the parcel id is : " + pid);
        System.out.println("the reciepients name is : "+name);
        System.out.println("the mobile number is : "+num);
        System.out.println("the parcel size is : "+ps);
        System.out.println("the locker assigned is : "+ locker);
        System.out.println("the parcel weight in KG'S is : "+we);
        System.out.println("service served accordingly :   "+express);
        System.out.println("the storage fees is :"+fee*we);
        System.out.println("the pickup code is : " + pcd);
         sc.close();

    }
    
}
