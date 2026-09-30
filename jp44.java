public class jp44{
    public static void main (String[] args)
    {
        book b1 = new book();
        book b2 = new book("java",349.0);
    }
}
class book{
    String title; double price;
    book() { this ("untitled",6.0);}
}