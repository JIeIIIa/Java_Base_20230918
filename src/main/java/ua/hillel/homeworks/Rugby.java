package ua.hillel.homeworks;

import java.util.concurrent.ThreadLocalRandom;

public class Rugby {
    public static void main(String[] args) {
        int playerCount = 25;
        int[] firstTeamAges = generatePlayerAges(playerCount);
        int[] secondTeamAges = generatePlayerAges(playerCount);

        System.out.println("First team ages: ");
        showInfo(firstTeamAges);
        System.out.println("Second team ages: ");
        showInfo(secondTeamAges);

        double firstTeamAverageAge = averageAge(firstTeamAges);
        System.out.printf("Average age of the first team is %.2f\n", firstTeamAverageAge);
        double secondTeamAverageAge = averageAge(firstTeamAges);
        System.out.printf("Average age of the second team is %.2f\n", secondTeamAverageAge);
    }

    private static double averageAge(int[] ages) {
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        return sum / (double) ages.length;
    }

    private static void showInfo(int[] ages) {
        for (int playerAge : ages) {
            System.out.print(playerAge + ", ");
        }
        System.out.println();
    }

    public static int[] generatePlayerAges(int size) {
        int[] ages = new int[size];
        for (int i = 0; i < ages.length; i++) {
            ages[i] = ThreadLocalRandom.current().nextInt(18, 41);
        }

        return ages;
    }
}
