class vehicle{
    void move()
    {
        System.out.println("vehicle moves");
    }
}
class car extends vehicle{
    void wheel()
    {
        System.out.println("car has 4 wheels");
    }
}
class electriccar extends car{
    void charge()
    {
        System.out.println("car is charging");
    }
}
public class multiin{
    public static void main(String[] args){
        electriccar e = new electriccar();
        e.move();
        e.wheel();
        e.charge();
    }
}