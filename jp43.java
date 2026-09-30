class book {
    String title;
    book() {
        title = "untitled";
    } 

}
public class jp43{
  public static void main(String[] args){
    book b = new book();
    System.out.println(b.title);
  }
}