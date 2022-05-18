package homework7Kramarenko;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] team1 = new int[25];
        int[] team2 = new int[25];
        Random random = new Random();
        int ageMin = 18;
        int ageMax = 40;
        System.out.print("Команда 1. Вік гравців: ");
        int average = 0;
        if (team1.length > 0) {
            double sum1 = 0;
            double sum2 = 0;
            for (int i = 0; i < team1.length; i++) {
                team1[i] = random.nextInt(ageMax - ageMin) + ageMin;
                System.out.print(team1[i] + "|");
                sum1 += team1[i];
            }
            average = (int) sum1 / team1.length;
            System.out.println("\nСередній вік: " + average);

            System.out.print("Команда 2. Вік гравців: ");
            for (int i = 0; i < team2.length; i++) {
                team2[i] = random.nextInt(ageMax - ageMin) + ageMin;
                System.out.print(team2[i] + "|");
                sum2 += team2[i];
            }
            average = (int) sum2 / team2.length;
            System.out.println("\nСередній вік: " + average);
        }
    }
}
