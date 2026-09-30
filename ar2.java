public class ar2 
{
    public static void main(String[] args)
    {
        int[] prices = new int[5];

        prices[0]=100;
        prices[1]=150;
        prices[2]=200;
        prices[3]=250;
        prices[4]=300;

        for(int i = 0;i<prices.length;i++){
            System.out.println("product "+ (i+1)+"price : "+prices[i] );

        }
    }
    
}
