package ua.hillel.lessons.lecture02;

public class Lecture02 {
    public static void main(String[] args) {
        ints();
        doubles();
        characters();
        incrementAndDecrement();
        booleans();
    }

    private static void booleans() {
        boolean flag = true;
        flag = false;
    }

    private static void incrementAndDecrement() {
        int a = 1;
        System.out.println("a = " + a);
        a += 10;
        System.out.println("a = " + a);
        a++;
        System.out.println("a = " + a);
        ++a;
        System.out.println("a = " + a);
        System.out.println();

        System.out.println("Example 1:");
        a = 1;
        int b = 23;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a++ + ++b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();

        System.out.println("Example 2:");
        a = 1;
        b = 23;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int result = a++ + ++b;
        System.out.println("result = " + result);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();

        byte first;
        first = 127;
        first += 1; // first = (byte) (first + 1)
        first += 2;
        System.out.println("first = " + first);

        first = -128;
        first--;
        System.out.println("first = " + first);

        first /= 10;
        first -= 1;
        first *= -1;
        System.out.println("first = " + first);
        System.out.println();
    }

    private static void characters() {
        System.out.println("   -= FLOAT AND DOUBLE =-");
        char ch0 = 'B';
        char ch1 = 'A' + 1;
        char ch2 = 66;
        char ch3 = '\u0042';
        System.out.println("ch0 = " + ch0);
        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);
        System.out.println("ch3 = " + ch3);

        System.out.println();
    }

    private static void doubles() {
        System.out.println("   -= FLOAT AND DOUBLE =-");
        float f = 1.2F;
        System.out.println("f = " + f);
        double d = 1.2;
        System.out.println("d = " + d);

        byte byteValue = (byte) f;
        System.out.printf("Cast f to byte: f == %f, byteValue == %d", f, byteValue);
        System.out.println();

        d = f / d;
        System.out.println("d (after f / d) == " + d); // d != 1.000000000000
        System.out.println();
    }

    private static void ints() {
        System.out.println("   -= BYTE =-");
        byte first = 123;
        byte second = 10;
        System.out.println("Division: " + (first / second));
        byte byteResult = (byte) ((first / second) * (first - second) / second);
        System.out.println("Complex expression: " + byteResult);
        System.out.println();

        System.out.println("   -= SHORT =-");
        short third = 1_0_____0_0;
        System.out.println("third: " + third);
        short fourth = 54;
//        short shortResult = 54 + third; // error, because result is int
        short shortResult = (short) (54 + third);
        System.out.println("result = " + shortResult);
        System.out.println();


        System.out.println("   -= INT =-");
        int a = 1000;
        int b = 2000;
        int result = a + b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Sum of a and b: " + result);
        System.out.println("concat = " + a + b);
        System.out.println("concat (with parenthesis) = " + (a + b));
        a = 016;    // a literal starting with 0 is octal (Base 8 Number system)
        System.out.println("a (016): " + a);
        a = 0b110;  // a literal starting with 0b us binary (Base 2 Number system)
        System.out.println("a (0b110): " + a);
        a = 0x1F;   // a literal starting with 0x is hexadecimal (Base 16 Number system)
        System.out.println("a (0x1F): " + a);
        System.out.println();


        System.out.println("   -= LONG =-");
        long l = 10_000_000_000L;
        System.out.println("l = " + l);
        System.out.println();
    }
}
