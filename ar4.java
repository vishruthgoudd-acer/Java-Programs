import java.util.Scanner;
public class ar4 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] rns = new int[4];

        System.out.println("enter the first roll number :");
        rns[0]=sc.nextInt();

        System.out.println("enter the second roll number :");
        rns[1]=sc.nextInt();

        System.out.println("enter the third roll number :");
        rns[2]=sc.nextInt();

        System.out.println("enter the fourth roll number : ");
        rns[3]=sc.nextInt();


    System.out.println("pavan <3 74");

        for(int i = 0;i<rns.length;i++){
            System.out.println("the roll numbers are :" +rns[i]);
        }

    }
    
}
