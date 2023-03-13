package io.javabrains.javacollections;

/*
Create a Java program that allows a user to perform various operations on an ArrayList of integers.
The program should display a menu of options, and the user should be able to select one of the following operations:

1. Add an element to the list
2. Remove an element from the list
3. Find the minimum element in the list
4. Find the maximum element in the list
5. Print the contents of the list
6. Quit the program

The program should continue to display the menu and allow the user to perform operations until they choose to quit.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class ListHomework1 {
    public static List<Integer> getList() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = ListHomework1.getList();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\n");
            System.out.println("Press 1. Add an element to the list");
            System.out.println("Press 2. Remove an element from the list");
            System.out.println("Press 3. Find the minimum element in the list");
            System.out.println("Press 4. Find the maximum element in the list");
            System.out.println("Press 5. Print the contents of the list");
            System.out.println("Press 6. Quit the program");
            System.out.println("Enter your Selection... ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
//                Add an element to the list
                    System.out.println("Enter element to add in the list... ");
                    list.add(input.nextInt());
                    break;
                case 2:
//                2. Remove an element from the list
                    System.out.println("Enter element remove from the list... ");
                    list.remove(list.indexOf(input.nextInt()));
                    break;
                case 3:
//                3. Find the minimum element in the list
                    System.out.println(Collections.min(list));
                    break;
                case 4:
//                4. Find the maximum element in the list
                    System.out.println(Collections.max(list));
                    break;
                case 5:
//                5. Print the contents of the list
                    for (Integer i : list) {
                        System.out.print(i + " ");
                    }
                    break;
                case 6:
//                6. Quit the program
                    System.exit(0);
                    break;
                default:
            }
        }

    }

}
