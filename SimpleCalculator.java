// Multilevel Inheritance

public class SimpleCalculator {

    void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }
}

class AdvanceCalculator extends SimpleCalculator {

    void subtract(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }
}

class SuperAdvanceCalculator extends AdvanceCalculator {

    void square(int x) {
        System.out.println("Square = " + (x * x));
    }

    void division(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            System.out.println("Division = " + (a / b));
        }
    }
}

class Main {

    public static void main(String[] args) {

        SimpleCalculator c1 = new SimpleCalculator();
        AdvanceCalculator c2 = new AdvanceCalculator();
        SuperAdvanceCalculator c3 = new SuperAdvanceCalculator();

        System.out.println("Simple Calculator");
        c1.add(2, 3);

        System.out.println("------------------------");

        System.out.println("Advance Calculator");
        c2.add(10, 5);       // Inherited method
        c2.subtract(10, 5);

        System.out.println("------------------------");

        System.out.println("Super Advance Calculator");
        c3.add(20, 10);      
        c3.subtract(20, 10); 
        c3.square(5);
        c3.division(20, 4);
    }
}