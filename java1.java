import java.util.Scanner;
public class java1 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the day ");
        int a = sc.nextInt();
        
        String name ;
        switch (a ) {
            case 1 : name = "monday" ;
            break ;
            case 2 : name = "tuesday" ;
            break ;
            case 3 : name = "wednesday" ;
            break;
            case 4 : name = "thursday" ;
            break ;
            case 5 : name  = "friday" ;
            break ;
            default : name = "weekend"  ;
            break ;
        }
        System.out.println("the day is : " + name);

        sc.close();
    }
    
}
