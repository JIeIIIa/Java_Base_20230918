package ua.hillel.lessons.lecture12;

public class Calculator {
    // n! == 1 * a * ... * (n-1) * n;
    // 0! == 1;
    public long factorial(int value) {
        long result = 1;
        for (int i = 2; i <= value; i++) {
            result *= i;
        }

        return result;
    }


}
