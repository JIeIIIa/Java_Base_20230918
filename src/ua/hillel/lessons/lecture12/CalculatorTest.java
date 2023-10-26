package ua.hillel.lessons.lecture12;

public class CalculatorTest {
    public void factorialOfZeroTest() {
        Calculator calculator = new Calculator();
        System.out.println("1 == " + calculator.factorial(0));
    }


    public void factorialOfTwo() {
        Calculator calculator = new Calculator();
        System.out.println("2 == " + calculator.factorial(2));
    }


    public void factorialOfTen() {
        Calculator calculator = new Calculator();
        System.out.println("3628800 == " + calculator.factorial(10));
    }

    public void factorialOfOne() {
        Calculator calculator = new Calculator();
        System.out.println("1 == " + calculator.factorial(1));
    }

    public static void main(String[] args) {
        CalculatorTest instance = new CalculatorTest();
        instance.factorialOfZeroTest();
        instance.factorialOfOne();
        instance.factorialOfTwo();
        instance.factorialOfTen();
    }
}
