package ua.hillel.lessons.lecture08;

import java.util.concurrent.ThreadLocalRandom;

public class ArrayExample {
    public static void main(String[] args) {
        task1();
//        swatWithXorTesting();
    }

    private static void swatWithXorTesting() {
        int[] array = {1, 6};
        System.out.println(array[0] + " " + array[1]);
        swapWithXor(array, 0, 1);
        System.out.println(array[0] + " " + array[1]);
        System.out.println(array);
    }

    /**
     * a. Задати масив цілих чисел довжини N елементів та заповнити його рандомними числами
     * відсортувати масив та вивести на екран. Поміняти місцями перший та останній елемент, вивести масив на екран ще раз.
     */
    public static void task1() {
        int size = 25;
        int[] array = new int[size];
        fillArray(array);
        System.out.println("Initial array: " + toString(array));
        sort(array);
        System.out.println("Sorted array: " + toString(array));
        swap(array, 0, array.length - 1);
        System.out.println("Array after swap: " + toString(array));

    }

    private static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    // a ^ b ^ b == a
    private static void swapWithXor(int[] array, int i, int j) {
        array[i] ^= array[j];
        array[j] ^= array[i];
        array[i] ^= array[j];
    }

    private static String toString(int[] array) {
        String result = "[";
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                result += ", ";
            }
            result += array[i];
        }
        result += "]";

        return result;
    }

    private static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(100);
        }
    }
}
