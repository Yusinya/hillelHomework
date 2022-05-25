package homework9Kramarenko;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int s = 3;
        int matrix1[][]=new int[s][s];
        int matrix2[][]=new int[s][s];
        int matrix3[][]=new int[s][s];
        Random random = new Random();

        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                matrix1[i][j] = random.nextInt(0, 10);
                matrix2[i][j] = random.nextInt(0, 10);
            }
        }
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                for (int k = 0; k < s; k++) {
                    matrix3[i][j] += matrix1[i][k] * matrix2[j][j];
                }
            }
        }
        System.out.println("Результат перемноження: ");
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < matrix3[0].length; j++) {
                System.out.printf("%6d ", matrix3[i][j]);
            }
            System.out.println();
        }
    }
}
