// Parent class
class Animal {
    String name = "Animal";

    Animal(){
        System.out.println("Animal Construtor");
    }
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    String name = "Dog";

    Dog(){
        super();
        System.out.println("Dog constructor");
    }

    void printNames() {
        System.out.println("Child class name: " + name);
        System.out.println("Parent class name using super: " + super.name); // Access parent variable
    }

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void showSound() {
        System.out.println("Calling overridden method from child:");
        sound();
        System.out.println("Calling parent method using super:");
        super.sound(); // Call parent method
    }
}

// Main class
public class SuperKeyword {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printNames();   // Accessing child and parent class variables
        d.showSound();    // Calling child and parent methods
    }
}
