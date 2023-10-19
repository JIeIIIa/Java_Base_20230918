package ua.hillel.lessons.lecture07;

import java.util.concurrent.ThreadLocalRandom;

public class Lecture07Demo {
    public static void main(String[] args) {
        int[] array = new int[98];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(100);
        }
//        int[] array = {1, 2, 4, 22, 5, 6, 4, 7};
//        array = new int[]{1, 2, 4, 5, 6, 7, 22};
//        multiDimArrays();

//        sumRecursion(10);
//        demo3();
//        System.out.println(demo5(array, -7));
        bubbleSort(array);
        print(array);
    }

    private static void multiDimArrays() {
        int[][] matrix = {
                {1, 2, 3},
                null,
                {7, 8, 9}
        };  // initialization option-1
//        matrix = new int[3][5]; // initialization option-2
        matrix = new int[3][];
//        int[] array = new int[ThreadLocalRandom.current().nextInt(10)];
        int[] array = new int[3];
        for (int i = 0; i < matrix.length; i++) {
//            matrix[i] = new int[ThreadLocalRandom.current().nextInt(10)];
            matrix[i] = array;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(100);
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }

//        for (int i = 0; i < matrix.length; i++) {
//            print(matrix[i]);
//            System.out.println();
//        }
    }

    public static void print(int[] array) {
        if (array == null) {
            return;
        }
        for (int value : array) {
            System.out.print(value + ", ");
        }
    }


    /**
     * O(N)
     */
    // f(n) = n
    public static int sum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }

        return result;
    }

    /**
     * O(N)
     */
    // g(n) == n + g(n-1);
    public static int sumRecursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumRecursion(n - 1);
        }
    }

    /**
     * O(N) = 2*N ~ N
     */
    public static int sum2(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sumPair(i, i + 1, 1);
        }
        return sum;
    }

    /**
     * O(1)
     */
    public static int sumPair(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * O(N)
     */
    public static void demo1() {
        int[] array = {1, 2, 3, 4, 5};
        int min = array[0];
        int max = array[0];
        for (int x : array) {
            if (x < min) {
                min = x;
            }
            if (x > max) {
                max = x;
            }
        }
    }

    /**
     * З точки зору команд процесораа, цей варіант повільніший
     * Але BigO демонструє як себе поводить алгоритм
     * O(N)
     */

    public static void demo2() {
        int[] array = {1, 2, 3, 4, 5};
        int min = array[0];
        int max = array[0];
        for (int x : array) {
            if (x < min) {
                min = x;
            }
        }
        for (int x : array) {
            if (x > max) {
                max = x;
            }
        }
    }

    /**
     * O(N^2) ~ n^2 - 4*n
     * O(N) * O(N)
     */
    public static void demo3() {
        int n = 10;
        int steps = 0;
        for (int i = 0; i < n - 4; i++) { // n
            for (int j = 0; j < n; j++) { //
                System.out.print(i * j + " ");
                steps++;
            }
            System.out.println();
        }
        System.out.println(steps); // n* (n - 4) ~ n^2
    }

    /**
     * O(N^3)
     */
    public static void demo4() {
        int n = 10;
        for (int i = 0; i < n; i++) { // n * (N^2)
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < n; l++) {

                }
            }
        }
    }


    // 1 4 5 6 9 14 15 20 21
    // 4


    /**
     * O(logN)
     * Найгірший варіант для масива із 16 елементів
     * N = 16 - 2^4
     * N = 8 - 2^3
     * N = 4 - 2^2
     * N = 2 - 2^1
     * N = 1 - 2^0
     * <p>
     * 2^4=16 - 2^k = N тоді з математики відомо, що   k = log2N
     * O(k) = O(log2N)
     * Основа логорифма не береться до уваги, logA(N) = logB(N)/logB(A), а 1/logB(A) = константа:
     * O(k) = O(logN)
     */
    public static int demo5(int[] array, int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (array[middleIndex] == elementToSearch) {
                return middleIndex;
            } else if (array[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
            } else {
                lastIndex = middleIndex - 1;
            }
        }

        return -1;
    }

    // O(N^2)
    public static void bubbleSort(int[] array) {
        int step = 0;
        for (int i = 0; i < array.length - 1; i++) {
            System.out.printf("Step %02d: ", i);
            for (int j = 0; j < array.length - 1; j++) {
                step++;
                if (array[j] > array[j + 1]) {
                    swap(array, j);
                }
            }
            print(array);
            System.out.println();
        }
        System.out.println("step == " + step);
    }

    public static void bubbleSortVersion2(int[] array) {
        int step = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                step++;
                if (array[j] > array[j + 1]) {
                    swap(array, j);
                }
            }
            print(array);
            System.out.println();
        }
        System.out.println("step == " + step);
    }

    public static void bubbleSortReverse(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    swap(array, j);
                }
            }
        }
    }

    private static void swap(int[] array, int i) {
        int tmp = array[i];
        array[i] = array[i + 1];
        array[i + 1] = tmp;
    }


    /**
     * a. Задати масив цілих чисел довжини N елементів та заповнити його рандомними числами
     * відсортувати масив та вивести на екран. Поміняти місцями перший та останній елемент, вивести масив на екран ще раз.
     */
    public static void task1() {

    }
}
