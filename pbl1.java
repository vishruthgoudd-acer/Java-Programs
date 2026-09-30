import java.util.Scanner;
public class pbl1 
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int[] marks = new int[5];
      System.out.println("Enter marks for 5 students:");
      for(int i=0; i<marks.length; i++)
      {
          marks[i] = sc.nextInt();
      }
       int search = sc.nextInt();
       for(int i=0; i<marks.length; i++)
       {
        if(marks[i] == search)
        {
            System.out.println(search + " found at index : " + i);
        }
       }
       int count = 0;
         for(int i=0; i<marks.length; i++)
         {
          if(marks[i] >= 35)
          {
                count++;
          }else{
            System.out.println("Student failed with marks: " + marks[i]);
          }
         }
         System.out.println("Number of students passed: " + count);
         int highest = marks[0];
         int lowest = marks[0];
         for(int i=0; i<marks.length; i++)
         {
            if(marks[i] > highest)
            {
                highest = marks[i];
            }
            if(marks[i] < lowest)
            {
                lowest = marks[i];
            }
         }
          System.out.println("Highest marks: " + highest);
          System.out.println("Lowest marks: " + lowest);
         
         sc.close();

    } 

    
}
