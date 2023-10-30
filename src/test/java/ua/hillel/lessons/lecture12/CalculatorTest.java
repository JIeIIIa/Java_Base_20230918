package ua.hillel.lessons.lecture12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
//    @Disabled
    public void factorialOfZeroTest() {
        // given
        Calculator calculator = new Calculator();

        // when
        long result = calculator.factorial(0);

        // then
        Assertions.assertEquals(1, result);
    }


    @Test
    public void factorialOfTwo() {
        // given
        Calculator calculator = new Calculator();

        // when
        long result = calculator.factorial(2);

        // then
        Assertions.assertEquals(2, result);
    }


    @Test
    public void factorialOfTen() {
        // given
        Calculator calculator = new Calculator();

        // when
        long result = calculator.factorial(10);

        // then
        Assertions.assertEquals(3628800, result);
    }

    @Test
    public void factorialOfOne() {
        // given
        Calculator calculator = new Calculator();

        // when
        long result = calculator.factorial(1);

        // then
        Assertions.assertEquals(1, result);
    }


    @Test
    public void factorialOfNegative() {
        // given
        Calculator calculator = new Calculator();

        // when
        long result = calculator.factorial(-10);

        // then
        Assertions.assertEquals(1, result);
    }
}
