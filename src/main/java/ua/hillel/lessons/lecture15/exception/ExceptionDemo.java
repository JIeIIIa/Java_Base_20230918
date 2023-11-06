package ua.hillel.lessons.lecture15.exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int result = calculate(42, 0);
            System.out.println("Result is " + result);
        } catch (CalculationException e) {
            System.out.println("Caught an exception: " + e.getClass() + " with message " + e.getMessage());
            throw new RuntimeException(e);
        }

        System.out.println("Done");
    }

    public static int calculate(int a, int b) throws CalculationException {
        if (b == 0) {
            throw new CalculationException("You are trying to divide by zero");
        }
        System.out.println("Calculating...");
        return a / b;
    }
}
