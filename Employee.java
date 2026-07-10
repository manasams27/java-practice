public class Employee {
<<<<<<< HEAD
    //Atributes | Fields | Instance Variables | Properties | Variables
    int id;
    String name;
    double salary;
    static String company = "TCS";
    Employee(){
        this(0, "Not Assigned", 0.0);
    }
    Employee(int id, String name){
        this(id, name, 30000);
    }
    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void display(){
        System.out.println(id + " " + name + " " + salary + " " + company);
    }
    public static void main(String[] args){
        Employee e0 = new Employee();
        e0.display();
        Employee e2 = new Employee(103, "megha");
        e2.display();
        Employee  e1 = new Employee(101, "Kavana", 45000);
        e1.display();
    }

    
=======
    //Private Access Modifiers 
    // for encapsulation
    private String name;
    private int salary;
    //setters => void
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    //getters => based on vars
    public String getName(){
        return this.name;
    }
    public int getSalary(){
        return this.salary;
    }
>>>>>>> b2dc857 (Java Practiced codes)
}
