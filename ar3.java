import java.util.Scanner;
public class ar3 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[3];

        System.out.println("enter the first marks");
        marks[0]=sc.nextInt();

        System.out.println("enter the ssecond marks");
        marks[1]=sc.nextInt();

        System.out.println("enter the third marks");
        marks[2]=sc.nextInt();

        for(int i = 0;i<marks.length;i++){
            System.out.println("the marks are : "+marks[i]);
        }
    }
    
}
