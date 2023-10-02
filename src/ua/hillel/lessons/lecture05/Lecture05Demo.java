package ua.hillel.lessons.lecture05;

public class Lecture05Demo {
    public static void main(String[] args) {
//        ifElseDemo();
        switchDemo();
    }

    private static void switchDemo() {
        String angles = "6";

        switch (angles) {
            case "3":
                System.out.println("Triangle");
            case "4":
                System.out.println("Square");
                break;
            case  "5": case "6": case "7":
                System.out.println("More than 4");
                break;
            default:
                System.out.println("Unknown");
        }
    }

    private static void ifElseDemo() {
        int angles = 3;

        if (angles == 3) {
            System.out.println("Triangle");
        } else if (angles == 4) {
            System.out.println("Square");
        } else {
            System.out.println("Unknown");
        }
    }
}
