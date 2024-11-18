// Parent class (Superclass)
class Animal {
    // Field of the Animal class
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method of the Animal class
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class (Subclass) inheriting from Animal
class Dog extends Animal {

    // Constructor of the Dog class
    public Dog(String name) {
        // Calling the parent class constructor
        super(name);
    }

    // Method overriding the makeSound() method from Animal class
    @Override
    public void makeSound() {
        System.out.println(name + " says Woof!");
    }
}

public class OOPS_Inheritance {
    public static void main(String[] args) {
        // Creating an object of Dog class
        Dog dog = new Dog("Buddy");
        dog.makeSound();  // Output: Buddy says Woof!
    }
}
