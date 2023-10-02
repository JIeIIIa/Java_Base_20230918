package ua.hillel.lessons.lecture04;

import java.util.Scanner;

public class VariablesDemo {
    public static Scanner scanner = new Scanner(System.in);
    public static int value = 10;

    public static void main(String[] args) {
        scanner.nextLine();
        bar(43); // call before foo() method !!!
        foo(value);
        System.out.println(value);
    }

    public static void foo(int value) {
        int i = 0;
        scanner.nextLine();
        value = 42;
        System.out.println(value);
    }

    public static void bar(int value) {
//        System.out.println(i);
        scanner.nextLine();
        value = 0;
    }
}
