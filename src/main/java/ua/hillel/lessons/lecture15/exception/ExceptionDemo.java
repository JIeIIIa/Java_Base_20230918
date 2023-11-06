package ua.hillel.lessons.lecture15.exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        calculate(42, 0);
    }

    public static int calculate(int a, int b) {
        if (b == 0) {
            throw new CalculationException("You are trying to divide by zero");
        }
        return a / b;
    }
}
