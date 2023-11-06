package ua.hillel.lessons.lecture15.exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int result = calculate(10, -10);
            System.out.println("Result is " + result);
        } catch (WrongDataException e) {
            System.out.println("Wrong data. Please try again...");
        } catch (CalculationException e) {
            System.out.println("Caught an exception: " + e.getClass() + " with message " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught an exception: " + e.getClass() + " with message " + e.getMessage());
        }

        System.out.println("Done");
    }

    public static int calculate(int a, int b) throws CalculationException {
        if (a == 0) {
            throw new ArithmeticException("a is zero");
        } else if (b == 0) {
            throw new CalculationException("You are trying to divide by zero");
        } else if (b < 0) {
            throw new WrongDataException("Wrong input data: b == " + b);
        }
        System.out.println("Calculating...");
        return a / b;
    }
}
