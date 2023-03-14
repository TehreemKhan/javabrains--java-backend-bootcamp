package io.javabrains.javabasics;

import java.util.Arrays;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
        int[] arr = {10, 20, 30, 40, 50};


        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        System.out.println("Sum "+ Arrays.stream(arr).sum());
        System.out.println("Average "+ Arrays.stream(arr).average().toString());
        System.out.println("Largest number "+ Arrays.stream(arr).max().toString());


    }
}

//checked
