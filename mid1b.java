import java.util.Scanner;
public class mid1b 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the storage used in litres :");
        int usedS = sc.nextInt();
        int storage =50 ;
        if(usedS <= storage){
            System.out.println("The storage is grater than 0");

        }
        System.out.println("enter the pin number :");
        int pin = sc.nextInt();
        
        
        String Storage="occupied";
        System.out.println("The storage is " + Storage);
        if(pin == 570 && usedS <= storage){
            System.out.println("The pin correct and locker is open");
        } else {
            System.out.println("The pin is incorrect and locker is closed");
        }

    }


    }
    

