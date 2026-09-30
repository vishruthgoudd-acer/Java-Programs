class book{
    String title;
    double price ;
    book(String t , double p ){title = t; price=p;}
}
public class jp41{
    public static void main(String[] args)
    {
        book b = new book ("java",349);
        System.out.println(b.title);
        System.out.println(b.price);

    }
}
