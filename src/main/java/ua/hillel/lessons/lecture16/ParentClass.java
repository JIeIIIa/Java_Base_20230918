package ua.hillel.lessons.lecture16;

public class ParentClass implements ChildInterface {
    public static void callStatic() {
        System.out.println("Static method in ParentClass");
    }
    @Override
    public void foo() {
        System.out.println("FOO inside ParentClass");
    }

    @Override
    public void bar() {
//        MyInterface.super.bar();
        System.out.println("Override bar method");
    }
}
