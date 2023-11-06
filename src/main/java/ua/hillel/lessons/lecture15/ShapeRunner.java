package ua.hillel.lessons.lecture15;

import ua.hillel.lessons.lecture15.Shape.Edge;

public class ShapeRunner {
    public static void main(String[] args) {
//        nestedClasses();
        localInnerClass();
    }

    private static void localInnerClass() {
        class BoldEdge extends Edge {
            public BoldEdge(int length, String color) {
                super(length, color);
            }

            @Override
            public String toString() {
                return "I'm BoldEdge{" + super.toString() + "}";
            }
        }

        BoldEdge edge = new BoldEdge(42, "green");
        System.out.println("edge = " + edge);
    }

    private static void nestedClasses() {
        Edge edge = new Edge(10, "black");
        System.out.println("Edge is: " + edge);
    }
}
