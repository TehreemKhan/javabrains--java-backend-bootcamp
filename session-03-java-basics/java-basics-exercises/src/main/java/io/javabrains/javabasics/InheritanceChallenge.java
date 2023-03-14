package io.javabrains.javabasics;

/*

1.  Create an `Animal` class with member variables for the name and age of the animal and a constructor method that initializes the member variables.
2.  Create a `Dog` class that extends the `Animal` class and has a member variable for the breed of the dog and a constructor method that initializes the member variables.
3.  Override the `makeSound` method in the `Dog` class to print "The dog barks".
4.  Create a `Cat` class that extends the `Animal` class and has a member variable for the number of lives of the cat and a constructor method that initializes the member variables.
5.  Override the `makeSound` method in the `Cat` class to print "The cat meows".
6.  In the `main` method of this class, create an array of `Animal` objects and initialize it with a `Lion`, a `Dog`, a `Cat`, and another `Animal` of your choice.
7.  Loop through the array of `Animal` objects and print the name, age, and sound of each animal.
 */


class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String makeSound() {
        return "Animal Sound";
    }

    @Override
    public String toString() {
        return "Animal " + "name= " + name + " age= " + age + " Sound= " + this.makeSound();
    }
}


class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public String makeSound() {
        return "The dog barks";
    }

    @Override
    public String toString() {
        return "Dog " + "name= " + super.getName() + " age= " + super.getAge() + " Sound= " + this.makeSound();
    }
}

class Cat extends Animal {
    private int lives;

    public Cat(String name, int age, int lives) {
        super(name, age);
        this.lives = lives;
    }

    @Override
    public String makeSound() {
        return "The cat meows";
    }

    public String toString() {
        return "Cat " + "name= " + super.getName() + " age= " + super.getAge() + " Sound= " + this.makeSound();
    }
}


public class InheritanceChallenge {

    public static void main(String[] args) {
        Animal[] animals = {new Animal("Lion", 5), new Dog("Dog", 3, "Golder Retriver"), new Cat("Cat", 1, 9), new Animal("Elephant", 10)};
        for (Animal animal : animals) {
            System.out.println(animal);


        }


    }
}

//checked
