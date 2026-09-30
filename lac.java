import java.util.Scanner;
public class lac 
{
    public static void main (String[] args)
    {
      Scanner sc = new Scanner(System.in);
      String correctpass = "vishruth570";
      int attempts = 0;
      boolean access = false;
      while (attempts < 3) {
        System.out.println("enter the password");
        String input = sc.nextLine();
        attempts++;

       if (input.equals(correctpass)) {
        access = true;
        break;
       } else {
        System.out.println("incorrect password.attempt"+attempts+"of 3");
       }
      }
      if (access) {
        System.out.println("access granted");
      } else {
        System.out.println("account locked");
      }
      sc.close();
    }
    
}
