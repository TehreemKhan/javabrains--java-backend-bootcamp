package io.javabrains.javabasics;

import java.util.ArrayList;
import java.util.List;

public class Operators {
    public static void main(String[] args) {
        // Step 1: Declare variables
        int a = 20;
        int b = 10;

        // Step 2: Perform arithmetic operations
        int add = a + b;
        int sub = a - b;
        int mult = a * b;
        int div = a / b;
        int mod = a % b;

        // Step 3: Print the results of the arithmetic operations
        System.out.println("a = " + add);
        System.out.println("sub = " + sub);
        System.out.println("mult = " + mult);
        System.out.println("div = " + div);
        System.out.println("div = " + div);
        System.out.println("mod = " + mod);

        // Step 4: Perform increment and decrement operations
        a++;
        b--;


        // Step 5: Print the results of the increment and decrement operations
        System.out.println("a++ " + a);
        System.out.println("b++" + b);


        // Step 6: Perform comparison operations
        boolean isGreater = a > b;
        boolean isLess = a < b;
        boolean isEqual = a == b;


        // Step 7: Print the results of the comparison operations
        System.out.println("a > b " + isGreater);
        System.out.println("a < b " + isLess);
        System.out.println("a == b " + isEqual);

        // Step 8: Perform logical operations
        boolean t = true;
        boolean f = false;
        boolean or = t || f;
        boolean and = t && f;
        boolean notF =  !f;


        // Step 9: Print the results of the logical operations
        System.out.println("or = " + or);
        System.out.println("and = " + and);
        System.out.println("notF = " + notF);


    }
}
