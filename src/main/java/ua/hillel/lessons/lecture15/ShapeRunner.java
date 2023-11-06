package ua.hillel.lessons.lecture15;

import ua.hillel.lessons.lecture15.Shape.Edge;

public class ShapeRunner {
    public static void main(String[] args) {
        nestedClasses();
    }

    private static void nestedClasses() {
        Edge edge = new Edge(10, "black");
        System.out.println("Edge is: " + edge);
    }
}
