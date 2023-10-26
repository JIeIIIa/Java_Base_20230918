package ua.hillel.lessons.lecture12;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void factorialOfZeroTest() {
        Calculator calculator = new Calculator();
        System.out.println("1 == " + calculator.factorial(0));
    }


    @Test
    public void factorialOfTwo() {
        Calculator calculator = new Calculator();
        System.out.println("2 == " + calculator.factorial(2));
    }


    @Test
    public void factorialOfTen() {
        Calculator calculator = new Calculator();
        System.out.println("3628800 == " + calculator.factorial(10));
    }

    @Test
    public void factorialOfOne() {
        Calculator calculator = new Calculator();
        System.out.println("1 == " + calculator.factorial(1));
    }
}
