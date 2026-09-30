class circle {
    double radius ;
    double area()
    {
        return Math.PI*radius*radius;
    }
}
public class jp40{
    public static void main(String[] args)
    {
        circle c = new circle();
        c.radius = 2.3;
        System.out.println(c.area());
    }
}