
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void eat() {
        System.out.println("Dog is eating");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // Base class reference, base class object
        Animal a;
        Animal A = new Animal();

        a = A; // reference of Animal, pointing to Animal object
        a.sound();  // Output: Animal makes a sound
        A.sound();  // Output: Animal makes a sound
        a.sleep();  // Output: Animal is sleeping
        A.sleep();  // Output: Animal is sleeping

        // Base class reference, derived class object
        Dog d = new Dog();
        a = d; // reference of Animal pointing to Dog object

        a.sound();  // Output: Dog barks (runtime polymorphism)
        a.sleep(); // Output:Animal is sleeping
        // a.eat(); //  Error: eat() not accessible via Animal reference
        
        d.sound();  // Output: Dog barks
        d.eat();    //  Output: Dog is eating
    }
}






/* 
#include <iostream>
using namespace std;

// Base class
class Animal {
public:
    virtual void sound() {
        cout << "Animal makes a sound" << endl;
    }
    void sleep(){
        cout<<"Animal is sleeping"<<endl;
    }
};

// Derived class
class Dog : public Animal {
public:
    void sound() override {  // This overrides the base class method
        cout << "Dog barks" << endl;
    }
    void eat() {
        cout<<"Dog is eating"<<endl;
    }
};


int main() {
    Animal* a;  // Pointer to base class
    Animal A; 
    
    a = &A; //ptr of animal but stores address of animal object only
    a->sound(); // Output : Animal makes a sound
    A.sound(); // Output : Animal makes a sound
    a->sleep(); // Output : Animal makes a sound
    A.sleep(); // Output : Animal makes a sound
    

    Dog d;
    a = &d; //ptr of animal but stores address of dog object
    a->sound();  
    // Output : Animal makes a sound will be the output but we added virtual keyword to base class method and override keyword to same derived class method so though ptr is of base class and storing derived class object so at run time it will call method corresponding to the type of object adreess stored and will not call method correponding to type of object ptr so Output: Dog barks
    a->sleep(); // output:Animal is sleeping
    //a->eat();
    // will not work as whenever we store derived class address into bass class pointr it has access to base class method and overrided methods in derived class and nothing else
    d.sound(); // Output: Dog barks
    d.eat(); //Output : Dog is eating

    return 0;
}
 */