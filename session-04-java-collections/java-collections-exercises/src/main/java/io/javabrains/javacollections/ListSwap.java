package io.javabrains.javacollections;

/*
Write a method that accepts a list and two position ints and swaps the elements in the two positions
The method should be generic and accept any List
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSwap {

    public void swap(List<?> list, int pos1, int pos2) {
        System.out.println("List before swapping : " + list);
        Collections.swap(list, pos1, pos2);
        System.out.println("List after swapping : " + list);
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Android");
        list.add("Python");
        list.add("Node.js");
        new ListSwap().swap(list,0,2);

    }
}
