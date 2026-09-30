import java.util.Scanner;
public class p1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int total = 0;
        for(int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        System.out.println("Total: " + total);
        double average = (double) total / arr.length;
        System.out.println("Average: " + average);
        
         
    }
    
}
