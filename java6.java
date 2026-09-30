import java.util.Scanner;
public class java6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        String cp = "vishruth570";
        int attempts = 0;
        boolean accs = false;
        while (attempts < 3) {
            System.out.println("enter the password");
            String input = sc.nextLine();
            attempts++;
            if (input.equals(cp)) {
                accs = true;
                break;
            } else {
                System.out.println("incorrect password . remainings attempts : "+attempts);

            }
        }
        if (accs) {
            System.out.println("access granted");
        } else {
            System.out.println("account locked. try again");
        }
        sc.close();
    }
    
}
