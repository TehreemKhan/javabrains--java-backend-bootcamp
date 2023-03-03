package io.javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
        int i = 10;
        long l = 13435466546546L;
        float f = 0.5f;
        double d = 0.487587498;
        char c = 'a';
        boolean b = false;

        // Step 2: Convert primitive variables to wrapper objects
        Integer iWrapper = i;
        Long lWrapper = l;
        Float fWrapper = f;
        Double dWrapper = d;
        Character cWrapper = c;
        Boolean bWrapper = b;

        // Step 3: Print the values of the wrapper objects
        System.out.println("iWrapper = " + iWrapper);
        System.out.println("lWrapper = " + lWrapper);
        System.out.println("fWrapper = " + fWrapper);
        System.out.println("dWrapper = " + dWrapper);
        System.out.println("dWrapper = " + dWrapper);
        System.out.println("bWrapper = " + bWrapper);
        // Step 4: Convert wrapper objects back to primitive variables
        i = iWrapper;
        l = lWrapper;
        f = fWrapper;
        d = dWrapper;
        c = cWrapper;
        b = bWrapper;

        // Step 5: Print the values of the primitive variables
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("c = " + c);
        System.out.println("b = " + b);
    }
}
