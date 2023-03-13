package io.javabrains.javacollections;

/*
Print the list in forward and reverse order using iterators only
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class ListIteratorExercise {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.add("Item 5");
        Iterator i = list.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("Reverse Order");
        ListIterator iReverse = list.listIterator(list.size());
        while (iReverse.hasPrevious()){
            System.out.println(iReverse.previous());
        }

    }
}
