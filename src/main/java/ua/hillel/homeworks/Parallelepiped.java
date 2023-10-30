package ua.hillel.homeworks;

import java.util.Scanner;

public class Parallelepiped {
    public static void main(String[] args) {
//        int width = 10;
//        int height = 6;
//        int depth = 42;

        int width;
        int height;
        int depth;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input width, height, depth: ");
//        System.out.print("Width = ");
        width = scanner.nextInt();
//        System.out.print("Height = ");
        height = scanner.nextInt();
//        System.out.print("Depth = ");
        depth = scanner.nextInt();


        int volume = width * height * depth;
        System.out.println("Volume of parallelepiped is " + volume);

        int length = 4 * (width + height + depth);
        System.out.printf("Total edges length is %d", length);
    }
}
