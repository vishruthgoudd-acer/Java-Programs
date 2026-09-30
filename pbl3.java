
import java.util.Scanner;
class student {
    String name;
    int rollno;
    String branch;
    student(String name,int rollno,String branch)
    {
        this.name=name;
        this.rollno=rollno;
        this.branch=branch;
    }
    void display(){
        System.out.println("Name: "+name); 
        System.out.println("Roll No: "+rollno);
        System.out.println("Branch: "+branch);
    }
}
public class pbl3{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        student s1=new student (
            "rahul",
            101,
            "cse"
        );
        student s2 = new student(
            "sachin",
            102,
            "cse"
        );
        s1.display();
        System.out.println();
        s2.display();
    }
}