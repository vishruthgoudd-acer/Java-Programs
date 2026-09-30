class Employee {
    String name ;
    int id ;

    Employee(){
        name = "vishruth";
        id=30666;
    }
    void display(){
       System.out.println("student name :"+name);
       System.out.println("student ID :"+id);
    }
}
    public class jp47{
        public static void main(String[] args){
          Employee e = new Employee();
          e.display();
        }
    }
    

