package ua.hillel.lessons.lecture04;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CarNumberAnalyzer {
    public static void main(String[] args) {
//        naiveImplementation();
//        forLoop();
//        nestedForLoop();
        String[] carNumbers = {
                "AA1111AA",
                "AC2222AB",
                "AA3333AA",
                "AA4444AA",
                "BB5555BB",
                "AA6666AA",
                "AA7777AA"
        };
//        forEachLoop(carNumbers);
//        whileLoop(carNumbers);
//        doWhileLoop(carNumbers);
        randomNumbers();

    }

    private static void randomNumbers() {
        int minValue = 10;
        int maxValue = 20;

        int value = ThreadLocalRandom.current().nextInt(minValue, maxValue + 1);

        Random random = new Random();
        int anotherValue = random.nextInt(maxValue - minValue + 1) + minValue;
        System.out.println("value = " + value);
        System.out.println("anotherValue = " + anotherValue);
    }

    private static void doWhileLoop(String[] carNumbers) {
        int j = 0;
        int count = 0;
        do {
            if (carNumbers[j].contains("AA")) {
                count++;
            }
            j++;
        } while (j < carNumbers.length);
        System.out.println("count = " + count);
    }

    private static void whileLoop(String[] carNumbers) {
        int j = 0;
        int count = 0;
        while (j < carNumbers.length) {
            if (carNumbers[j].contains("AA")) {
                count++;
            }
            j++;
        }
        System.out.println("count = " + count);
    }

    private static void forEachLoop(String[] carNumbers) {
        for (String number : carNumbers) {
            System.out.println(number);
        }
    }

    private static void nestedForLoop() {
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }

    private static void forLoop() {
        int arraySize = 7;


        String[] carNumbers = new String[arraySize];

        carNumbers[0] = "AA1111AA";
        carNumbers[1] = "AC2222AB";
        carNumbers[2] = "AA3333AA";
        carNumbers[3] = "AA4444AA";
        carNumbers[4] = "BB5555BB";
        carNumbers[5] = "AA6666AA";
        carNumbers[6] = "AA7777AA";

//        arraySize = 1000;

        int count = 0;
        for (int j = 0; j < 10; j++) {
            if (carNumbers[j].contains("AA")) {
                count++;
            }
        }

        int i = carNumbers.length - 1;
        for (; ; ) {
            if (!(i > 0)) {
                break;
//                continue;
            }
            System.out.println(i + "");
            if (carNumbers[i].contains("AA")) {
                count++;
            }

//            i--;
        }

        System.out.println("Count = " + count);
    }

    private static void naiveImplementation() {
        String[] carNumbers = {
                "AA1111AA",
                "AC2222AB",
                "AA3333AA",
                "AA4444AA",
                "BB5555BB",
                "AA6666AA",
                "AA7777AA"
        };

        int count = 0;
        if (carNumbers[0].contains("AA")) {
            count++;
        }
        if (carNumbers[1].contains("AA")) {
            count++;
        }
        if (carNumbers[2].contains("AA")) {
            count++;
        }
        if (carNumbers[3].contains("AA")) {
            count++;
        }
        if (carNumbers[4].contains("AA")) {
            count++;
        }
        if (carNumbers[5].contains("AA")) {
            count++;
        }
        if (carNumbers[6].contains("AA")) {
            count++;
        }

        System.out.println("Count = " + count);
    }
}
