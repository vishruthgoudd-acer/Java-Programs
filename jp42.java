class student {
    String name ;
    student(String name ){
        this.name = name;
    }
}
public class jp42
{
    public static void main(String[] args){
        student s1 = new student("vishruth");
        System.out.println(s1.name);
    }
}