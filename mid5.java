import java.util.Scanner;
public class mid5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String customername,planname;
        double dataused;
        double finalbill;
        System.out.println("enter the customer name:");
        customername=sc.next();
        System.out.println("enter the data used in GB :");
        dataused=sc.nextDouble();
        if(dataused<= 2.0){
            planname = "Basic Plan";
            finalbill = 199;
        } else if (dataused<=5.0){
            planname="Standard plan";
            finalbill=399;
        } else if(dataused<= 7.5){
            planname="premium plan";
            finalbill=599;
        }else {
            planname = "unlimited ";
            finalbill = 799;
        }
        System.out.println("---------TELECOM BILL -----------");
           System.out.println("the data used in GB:"+dataused);
           System.out.println("the plan name is :"+planname);
           System.out.println("the final telecom bill is :"+finalbill);

    }
    
}
