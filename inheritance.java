class animal {
    void eat()
    {System.out.println("animal is eating");}
}
class Dog extends animal{
    void bark()
    {System.out.println("Dog is barking");}
}

public class inheritance{
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat(); // inheritance method
         d.bark(); //child's own method

        }
}
