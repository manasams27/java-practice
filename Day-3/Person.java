public class Person {
    Person(String name) {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    Student() {
        super("Kavana");   // Calls the parent class constructor
        System.out.println("Course : CSE");
    }

    public static void main(String[] args) {
        Student student = new Student();
    }
}