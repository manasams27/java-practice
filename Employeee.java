public class Employeee {
    String company = "Tripillar Solutions";
}
class Manager extends Employee{
    String company = "Coders Arcade";
    void show(){
        System.out.println("Current Company: " + this.compamny);
        System.out.println("Previous Company: " + super.company);
    }
}
