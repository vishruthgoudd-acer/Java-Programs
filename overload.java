public class overload 
{
    static int add(int a , int b ) {
        return a+b;
    }
    static int add (int a , int b , int c ){
        return a+b+c;
    }
    static double add (double a , double b){
      return a+b;
    }
    public static void main (String[] args){
        System.out.println("two integers = "+add(10,20));
        System.out.println("three integers = "+add(30,40,50));
        System.out.println("two doubles = "+add(20.9, 31.7));

    }
    
}
