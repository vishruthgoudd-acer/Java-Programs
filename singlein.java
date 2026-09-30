class phone {
    void call(){
        System.out.println("calling....");
    }
}
class smartphone extends phone{
    void browse(){
        System.out.println("browsing internet.....");
    }
}
public class singlein{
    public static void main(String[] args){
        smartphone p = new smartphone();
        p.call();
        p.browse();
    }
}
