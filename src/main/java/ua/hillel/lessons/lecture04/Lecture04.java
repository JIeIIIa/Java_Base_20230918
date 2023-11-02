package ua.hillel.lessons.lecture04;

public class Lecture04 {
    public static void main(String[] args) {
//        logicalNot();
//        System.out.println(ternaryOperator(10));
//        System.out.println(ternaryOperator2(17));
        arrayDemo();

    }

    public static void arrayDemo() {
        int firstPlayer = 10;
        int secondPlayer = 6;
        int thirdPlayer = 0;
        int fourthPlayer = 13;

        int[] players = new int[4];
//        int anotherPlayers[] = new int[4]; // avoid it!
        players[0] = 10;
        players[1] = 6;
        players[2] = 0;
        players[3] = 13;

        System.out.println(players[1]);

        int[] anotherPlayers = {10, 6, 0, 13};
        System.out.println(anotherPlayers);

        arrayParameter(new int[]{10, 6, 0, 13});
    }

    public static void arrayParameter(int[] array) {
        
    }
    
    
    public static String ternaryOperator(int age) {
//        if (age > 16) {
//            return "adult";
//        } else {
//            return "child";
//        }

        return age > 16 ? "adult" : "child";
    }

    public static String ternaryOperator2(int age) {
        return age < 0 ? "error" : age < 16 ? child() : "adult";
    }

    public static String child() {
        return "child";
    }

    public static void logicalNot() {
        int value = 15;
        System.out.println("value = " + value);
        System.out.println(Integer.toBinaryString(value));

        int newValue = ~value;
        System.out.println("newValue = " + newValue);
        System.out.println(Integer.toBinaryString(newValue));


        if (!(value == newValue)) {
            System.out.println("Not Equals");
        } else {
            System.out.println("Error");
        }

        if ((value == newValue)) {
            /* NoOP */
        } else {
            System.out.println("some message");
        }

        if (value != newValue) {
            System.out.println("some message");
        }
    }
}


