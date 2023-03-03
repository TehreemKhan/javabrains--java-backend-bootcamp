package io.javabrains.javacollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
Write code that calls the getFruits method and then iterates over the collection, printing each element to console
 */

public class IteratorExercise {
    public static void printFruits(){
        Collection<String> list = new FruitSupplier().getFruits();
        for (String s: list) {
            System.out.println(s);
            
        }
        
    }
    public static void main(String[] args) {
        IteratorExercise.printFruits();
    }


}


class FruitSupplier {
    public Collection<String> getFruits() {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        return list;
    }

}