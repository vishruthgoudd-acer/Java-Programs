public class sum 
{
    public static void main(String[] args)
    {
        int sum = 0;
        int n = 12378;
        while(n>0){
            sum+=(n%10);
            n=n/10;
        }
        System.out.println(sum);
    }
    
}
