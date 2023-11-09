package ua.hillel.lessons.lecture16;

public interface ChildInterface extends MyInterface {
    static void method() {
        System.out.println("Static method in ChildInterface");
    }
}
