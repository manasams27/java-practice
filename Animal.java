// Parent class
public class Animal {

    void eat() {
        System.out.println("Animal eats some food!");
    }

    void sound() {
        System.out.println("Animal makes some sound!");
    }
}

// Child class
class Cat extends Animal {

    void climb() {
        System.out.println("Cats can climb the trees.");
    }

    public static void main(String[] args) {

        Cat cat = new Cat();

        // Inherited methods
        cat.eat();
        cat.sound();

        // Child class method
        cat.climb();
    }
}