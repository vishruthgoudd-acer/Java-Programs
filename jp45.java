class Student {
    String name;
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
    
    public class jp45{
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "vishruth";
        s.marks = 97;

        s.display();
    }
}
