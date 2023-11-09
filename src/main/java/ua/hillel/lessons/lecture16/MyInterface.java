package ua.hillel.lessons.lecture16;

public interface MyInterface {
    static void method() {
        System.out.println("Static method in MyInterface");
    }

    void foo();

    default void bar() {
        System.out.println("I'm a default method");
    }
}
