package ua.hillel.lessons.lecture16;

public class MyInterfaceImpl implements MyInterface {
    @Override
    public void foo() {
        System.out.println("FOO inside MyInterfaceImpl");
    }

    @Override
    public void bar() {
//        MyInterface.super.bar();
        System.out.println("Override bar method");
    }
}
