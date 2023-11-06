package ua.hillel.lessons.lecture15;

import ua.hillel.lessons.lecture15.Shape.Edge;

public class ShapeRunner implements Runnable {
    public static void main(String[] args) {
        ShapeRunner job = new ShapeRunner();
        job.localInnerClass();
        job.run();

        Runnable runnableJob = new ShapeRunner();
        runnableJob.run();
    }

    private void anonymousClass() {
        Runnable jobRunnable = () -> System.out.println("Do some work...");
        jobRunnable.run();
    }

    private void localInnerClass() {
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

    private void nestedClasses() {
        Edge edge = new Edge(10, "black");
        System.out.println("Edge is: " + edge);
    }

    @Override
    public void run() {
//        nestedClasses();
//        localInnerClass();
        anonymousClass();
    }
}
