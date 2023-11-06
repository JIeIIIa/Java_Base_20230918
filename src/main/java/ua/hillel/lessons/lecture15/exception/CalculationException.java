package ua.hillel.lessons.lecture15.exception;

public class CalculationException extends RuntimeException {
    public CalculationException(String message) {
        super(message);
    }
}
