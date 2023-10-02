package ua.hillel.lessons.lecture03;

import java.util.Scanner;

public class Lecture03 {
    public static final Scanner SCANNER = new Scanner(System.in);


    public static void main(String[] args) {
//        variableExample();
//        methodExample();
//        doublesCompare();
//        scannerExample();
//        bitOperations();
//        logicalOperation();
//        ifExample();
//        ifExample2();
        doubleToInt();
    }

    private static void doubleToInt() {
        double a = 123.5;
        long result;

        result = (long) a;
        System.out.println(result);

        result = Math.round(a);
        System.out.println(result);


        double resultDouble = Math.floor(a);
        System.out.println(resultDouble);

        resultDouble = Math.ceil(a);
        System.out.println(resultDouble);
    }

    private static void ifExample2() {
        int a = 11;
        if (isPositive(a) || isOdd(a)) {
            System.out.println("Inside IF");
        } else {
            System.out.println("ELSE");
        }
    }

    private static boolean isOdd(int a) {
        System.out.println("isOdd");
        return a % 2 == 1;
    }

    private static boolean isPositive(int a) {
        System.out.println("isPositive");
        return a > 0;
    }


    private static void ifExample() {
        int age = 11;
        final int maxAge = 140;
        if (age <= 0 | age >= maxAge) {
            System.out.println("Wrong value");
        } else {
            System.out.println("Your age is " + age);
            if (age <= 16) {
                System.out.println("You are a child");
            } else if (age < 100) {
                System.out.println("You are an adult");
            } else {
                System.out.println("You are too old...");
            }
        }
    }


    private static void logicalOperation() {
        boolean first = true;
        boolean second = true;

        System.out.println(first & second);
        System.out.println(first | second);
        System.out.println(first ^ second);
    }


    private static void bitOperations() {
        byte a = 10;
        byte b = 13;
        System.out.println("and: " + (a & b));
        System.out.println("and: " + (a | b));
        System.out.println("and: " + (a ^ b));
    }

    private static void scannerExample() {
        System.out.print("input data: ");
        String line = SCANNER.nextLine();
        System.out.print("input int a and b: ");
        int a = SCANNER.nextInt();
        int b = SCANNER.nextInt();
        System.out.print("input another data: ");
        String tmp = SCANNER.nextLine();
        String anotherLine = SCANNER.nextLine();

        System.out.println("Your input line: " + line);
        System.out.println("Your input a: " + a + ", b: " + b);
        System.out.println("Your input nextLine: '" + anotherLine + "'");
    }

    public static void doublesCompare() {
        double a = 0.1 * 10;

        double b = 0;
        b += 0.1;
        b += 0.1;
        b += 0.1;
        b += 0.1;
        b += 0.1;
        b += 0.1;
        b += 0.1;
        b += 0.1;
        b += 0.1;
        b += 0.1;

        double eps = 0.00000001;
        System.out.println("Compare result: " + (Math.abs(a - b) < eps));
    }


    private static void methodExample() {
        int a = 10;
        int b = 42;

        System.out.println("Before calculation");
        System.out.println("MAIN: a = " + a);
        int result = calculateWithResult(a, b);
        result = calculateWithResult(a, b);
        System.out.println("MAIN: a = " + a);

        System.out.println("Result is " + result);
        printCalculationResult(10 + 394, "prefix");
        System.out.println("FINISHED");
    }

    public static void printCalculationResult(int a, int b) {
        System.out.println("a + b = " + (a + b));
    }

    public static void printCalculationResult(int a) {
        System.out.println("a + b = " + a);
    }

    public static void printCalculationResult(String prefix, int a) {
        System.out.println(prefix + "a + b = " + a);
    }


    public static int printCalculationResult(int a, String test) {
        System.out.println(test + "a + b = " + a);
        return 0;
    }

    public static int calculateWithResult(int a, int b) {
        System.out.println("a + b = " + (a + b));
        a *= 10;
        System.out.println("Method: a = " + a);
        int result = a + b;
        System.out.println(result);

        return result;
    }

    //f(x) == a*x + b
    public static double findRoot(int a, int b) {
        return 0;
    }

    private static void variableExample() {
        long myLong = 12345678912L;
        long myAnotherLong = ((byte) 123);
        float myFloat = 1.2F;
        double myDouble = 1.2;
    }
}
