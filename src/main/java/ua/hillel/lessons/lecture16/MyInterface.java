package ua.hillel.lessons.lecture16;

public interface MyInterface {
    void foo();

    default void bar() {
        System.out.println("I'm a default method");
    }
}
