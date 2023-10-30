package ua.hillel.lessons.lecture12;

public class Calculator {
    // n! == 1 * a * ... * (n-1) * n == n * ( 1 * a * ... * (n-1) ) = n * (n-1)!
    // 0! == 1;
    public long factorial(int value) {
        System.out.println("Input value = " + value);
        if (value <= 0) {
            return 1;
        }
        long result = value * factorial(value - 1);
        System.out.println("Result " + value + "! == " + result);
        return result;
    }


}
