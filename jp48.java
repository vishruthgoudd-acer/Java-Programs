class product {
    String name ;
    double price;
    product(String name, double price){
        this.name=name;
        this.price=price;
    }
    void display(){
        System.out.println("product :"+name);
        System.out.println("price :"+price);
    }
    
}
public class jp48{
    public static void main(String[] args){
       product p = new product("chocolate",89);
       p.display();
    }
}
