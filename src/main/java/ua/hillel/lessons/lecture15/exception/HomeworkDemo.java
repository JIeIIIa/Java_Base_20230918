package ua.hillel.lessons.lecture15.exception;

public class HomeworkDemo {
    public static void main(String[] args) {
        String line = "qwerty";
        System.out.println("Length is " + line.length());
        char character = line.charAt(2);
        System.out.println("Character at position 2 is " + character);

        System.out.println(character + " has code " + ((int) character)); // true
        System.out.println(('a' < character) + ": 'a' has code is " + ((int) 'a')); // true
        System.out.println(('z' < character) + ": 'z' has code is " + ((int) 'z')); // true
        System.out.println(('Z' < character) + ": 'Z' has code is " + ((int) 'Z')); // false

        for (int i = 'A'; i < 'z'; i++) {
            System.out.println((char) i);
        }
    }
}
