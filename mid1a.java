import java.util.Scanner;
public class mid1a {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the locker number :");
        int locker = sc.nextInt();
        System.out.println("enter the student id :");
        long sid = sc.nextLong();
        System.out.println("enter the student name :");
        String sname = sc.next();
        System.out.println("enter the access pin");
        int pin = sc.nextInt();
        if(pin == 570){
            System.out.println("access granted");
        } else {
            System.out.println("access denied");
        }
        
            if(locker >= 1 && locker <= 1000){
                System.out.println("locker is available");
            } else {
                System.out.println("locker is not available");
            }

          
        
    }
    
}
