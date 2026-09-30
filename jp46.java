class account{
    int accno;
    double balance;

void display(){
    System.out.println("Account no. :"+accno);
    System.out.println("Balance :"+balance);
}
}
public class jp46{
    public static void main(String[] args){
        account a = new account();
        a.accno = 100570;
        a.balance = 5700.89;
        a.display();
    }
    
    
}