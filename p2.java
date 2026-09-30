import java.util.Scanner;
public class p2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int sales[] = new int[7];
        System.out.println("Enter the sales for 7 days: ");
        for(int i=0;i<7;i++)
        {
            sales[i]=sc.nextInt();
        }
        int max = sales[0];
        int day = 0;
        for(int i=1;i<7;i++)
        {
            if(sales[i]>max)
            {
                max = sales[i];
                day = i;
            }
        }
        System.out.println("The maximum sales is: " + max + " on day: " + (day+1));
    }
    
}
