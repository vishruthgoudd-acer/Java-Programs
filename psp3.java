import java.util.Scanner;
public class psp3 
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter age");
        int age = sc.nextInt();

        System.out.println("enter percentage of marks");
        double percentage  = sc.nextDouble();

        boolean scholarship = (age >= 18 && percentage >= 75);

        boolean admission = (age >=18 || percentage >=75);

        boolean noteligible = !(age >=18);

        System.out.println("logical operator results");

        System.out.println("eligible for scholoarship (age >= 18 AND percentage >=75 : "+scholarship);

        System.out.println("eligible for admission (age >= 18 OR percentage >=75 : "+admission);

        System.out.println("Not eligible by age (! age >= 18) : "+noteligible);
        sc.close();
    }
    
}
