class vehicle {
    void start(){
        System.out.println("vehicle is starting");
    }
    
}
class car extends vehicle{
    void run(){
        System.out.println("car is running");
    }
}
public class jp49{
    public static void main(String[] args){
        car c = new car();
        c.start();
        c.run();

    }
}
