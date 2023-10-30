package ua.hillel.lessons.lecture12;

import org.junit.jupiter.api.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After all");
    }

    @BeforeEach
    void setUp() {
        System.out.println("I'm from BeforeEach");
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        System.out.println("from AfterEach");
        Assertions.assertNotNull(calculator);
    }

    @Test
//    @Disabled
    public void factorialOfZeroTest() {
        // given

        // when
        long result = calculator.factorial(0);

        // then
        Assertions.assertEquals(1, result);
    }


    @Test
    public void factorialOfTwo() {
        // given

        // when
        long result = calculator.factorial(2);

        // then
        Assertions.assertEquals(2, result);
    }


    @Test
    public void factorialOfTen() {
        // given

        // when
        long result = calculator.factorial(10);

        // then
        Assertions.assertEquals(3628800, result);
    }

    @Test
    public void factorialOfOne() {
        // given

        // when
        long result = calculator.factorial(1);

        // then
        Assertions.assertEquals(1, result);
    }


    @Test
    public void factorialOfNegative() {
        // given

        // when
        long result = calculator.factorial(-10);

        // then
        Assertions.assertEquals(1, result);
    }

    @Test
    void assertException() {
        Assertions.assertThrows(NullPointerException.class, () -> calculator.throwException());
    }
}
