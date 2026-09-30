class employee{
    void work(){
        System.out.println("employee works");
    }
}
class developer extends employee{
    void code(){
        System.out.println("developer writes code ");
    }
}

class tester extends employee{
void text(){
    System.out.println("tester finds bugs");
}
}

public class hierarchialin {
    public static void main(String[] args){
        tester t = new tester();
        t.work();
        t.text();
        developer d = new developer();
        d.work();
        d.code();

    }
    
}
