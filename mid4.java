
import java.util.Scanner;
public class mid4 {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int studentid;
      String studentname;
      int marks1,marks2,marks3,total;
      double average;
      double scholarshipamount = 10000;
      double bonuspercentage = 10;
      double bonusamount,finalscholarship;
        System.out.println("enter the student id :");
        studentid = sc.nextInt();
        System.out.println("entr the student name ");
        studentname = sc.next();
        System.out.println("enter the first subject marks");
        marks1 = sc.nextInt();
        System.out.println("enter the second subject marks");
        marks2 = sc.nextInt();
        System.out.println("enter the third subject marks ");
        marks3 = sc.nextInt();
        System.out.println();
        total = marks1 + marks2 + marks3;
        average = total/3.0;
        bonusamount = scholarshipamount*bonuspercentage/100;
        finalscholarship=scholarshipamount+bonusamount;

        System.out.println("student id is :"+studentid);
        System.out.println("student name is : "+studentname);
        System.out.println("Total marks are : "+ total);
        System.out.println("Average marks are : "+average);
        System.out.println("scholarship amount :"+scholarshipamount);
        System.out.println("bonus amount :"+bonusamount);
        System.out.println("final scholarship amount is : "+ finalscholarship);


      
    }
    
}