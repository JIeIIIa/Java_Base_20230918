package ua.hillel.lessons.lecture16;


public class ChildClass extends ParentClass {
    public static void callStatic() {
        System.out.println("Static method in ChildClass");
    }

    @Override
    public void foo() {
        System.out.println("FOO inside ChildClass");
    }
}
