package ua.hillel.lessons.lecture16;

public class Lecture16Demo {
    public static void main(String[] args) {
//        System.out.println(foo());
        autoCloseableDemo();
    }

    private static void autoCloseableDemo() {
        try (MyResource resource = new MyResource("pretty-file");) {
            foo();
        } finally {
            System.out.println("Try-with-resources FINALLY");
        }
    }

    public static String foo() {
        try {
            bar();
//        } catch (Exception e) {
//            System.out.println(e.getClass().getName() + " was fixed");
//            throw new RuntimeException("New exception");
        } finally {
            System.out.println("I'm from finally");
            if (true) {
                throw new CustomException("Exception from FINALLY");
//                return "Exceptional value";
            }
        }

        return "SUCCESS";
    }

    private static void bar() {
        throw new CustomException("Some exception occurs");
    }
}
