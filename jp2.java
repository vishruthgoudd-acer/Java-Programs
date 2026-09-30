
    import java.util.Scanner;
    public class jp2 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter attendance percentage: ");
        double attendance = sc.nextDouble();
 
        if (attendance >= 75) {
            System.out.println("Eligible for semester exam");
        } else {
            System.out.println("Not eligible for semester exam");
        }
    }
}

    

