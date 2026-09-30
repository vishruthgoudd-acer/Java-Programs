public class tier1 
{
    static String assignTier(char size,double weight){
        if (size == 's' && weight <= 1.0) return "SMALL";

        if (size == 'm' || weight <= 3.0) return "MEDIUM";
        return "large";
    }
    static double computeFee(String tier){
        switch(tier){
            case "MEDIUM":return 35.0;
            case "LARGE":return 50.0;
            default : return 20.0;
        }
    }
    static void printReceipt(String tier,double fee){
        System.out.println("tier:" + tier);
        System.out.printf("Fee: %.2f%n", fee);
    }
    public static void main(String[] args){
        String tier = assignTier('L',3.2);
        printReceipt(tier,computeFee(tier));
    }
    
}

