import java.util.Scanner;
public class pbl4
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
           System.out.print("enter parcel weight");
           double weight = Double.parseDouble(sc.nextLine());
           System.out.println("weight accepted."+weight +"KG");
        } catch
            (NumberFormatException e){
                System.out.println("Invalid input. please enter a valid number");
            }
            finally {
                System.out.println("weight checking completed");
            }
            sc.close();
        }
    
}