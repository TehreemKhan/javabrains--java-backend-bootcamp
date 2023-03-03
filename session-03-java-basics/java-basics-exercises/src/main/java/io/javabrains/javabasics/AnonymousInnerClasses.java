package io.javabrains.javabasics;

/*
Create a class `Animal2` with an abstract method `makeSound`.
Create an anonymous inner class implementation of `Animal2` and then call the `makeSound` method
 */

public class AnonymousInnerClasses {
    public static void main(String[] args) {
        Animal2 animal2 = new Animal2(){

            @Override
            void makeSound() {
                System.out.println("make sound");
            }
        };
        animal2.makeSound();

    }
    abstract static class Animal2 {
        abstract void makeSound();
    }
}
