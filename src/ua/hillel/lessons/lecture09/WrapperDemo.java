package ua.hillel.lessons.lecture09;

public class WrapperDemo {
    public static void main(String[] args) {
        int a = 42;
        Integer b = new Integer(100);
        Integer c = 100 + a; // auto-boxing
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int result = b + c; // auto-unboxing
        System.out.println("result = b + c = " + result);
        result = b.intValue() + c.intValue();
        System.out.println("result = b.intValue() + c.intValue() = " + result);

        a = new Integer(b.intValue() + c.intValue());
        System.out.println("a = new Integer(b.intValue() + c.intValue()) = " + a);

        System.out.println();
        System.out.println("Mim value if integer is " + Integer.MIN_VALUE);
        System.out.println("Max value if integer is " + Integer.MAX_VALUE);

        System.out.println("Method sum: " + sum(a, b));
        System.out.println("Method sum: " + sum(a, null));

        System.out.println("Method minus: " + minus(a, b));

    }

    public static Integer sum(Integer a, Integer b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }
}
