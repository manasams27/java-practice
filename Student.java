public class Student {
    String name;
    int age;
    String email;
    public Student(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }
    void display(){
        System.out.println("Name " + this.name);
        System.out.println("Age " + this.age);
        System.out.println("Email " + this.email);
    }
    public static void main(String[] args) {
        Student s1 = new Student("Roushan", 26, "raushan@123");
        s1.display();
        Student s2 = new Student("kavana", 20, "kavana@123");
        s2.display();
    }
}
