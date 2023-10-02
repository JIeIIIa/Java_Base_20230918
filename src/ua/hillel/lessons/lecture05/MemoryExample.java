package ua.hillel.lessons.lecture05;

import java.util.Scanner;

public class MemoryExample {
    public static void main(String[] args) {
        int value = 42;
        int a = 10;

        foo(a);
        Scanner scanner = new Scanner(System.in);

        System.out.println(a);
    }

    public static void foo(int a) {
        a += 2;
        System.out.println(a);
    }
}
