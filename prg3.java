import java.util.Scanner;
 public class prg3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entr the first subject marks");
        int s1 = sc.nextInt();

        System.out.println("enter second subject marks");
        int s2 = sc.nextInt();

        System.out.println("enter the second subject marks");
        int s3 = sc.nextInt();

        int sum = s1 + s2 + s3;
        double per = sum/3;
        System.out.println("the final sum is " + sum);
        System.out.println("the total percentage marks of the student" + per);
        sc.close();
    }
 } 
