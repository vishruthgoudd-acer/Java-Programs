import java.util.Scanner;

public class psp7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enteer the customer name");
        String cust = sc.nextLine();

       int price = 55;

       System.out.println("enter the quantity in KG'S");
       double qu = sc.nextDouble();

       double bill = qu * price;

       // the bill dislay 
       System.out.println("*************************************");
       System.out.println("the bill details are below");
       System.out.println("*************************************");
       System.out.println("the name of customer : " + cust);
       System.out.println("the quantity in kg's is : " + qu);
       System.out.println("the price of rice per kg today is : " + price);
       System.out.println("the total bill is : " + bill);
       System.out.println("*************THANK YOU FOR CHOOSING US *************");
       sc.close();
    }
}
