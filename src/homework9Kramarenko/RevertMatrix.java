package homework9Kramarenko;

import java.util.Scanner;

public class RevertMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть розмір першого масиву: ");
        int i = scanner.nextInt();

        System.out.println("Введіть розмір другого масиву: ");
        int j = scanner.nextInt();

        int[][] matrix1 = new int[i][j];
        for (int k = 0; k < i; k++) {
            for (int g = 0; g < j; g++) {
                matrix1[k][g] = i * k + g;
            }
        }
        System.out.println("Начальная матрица:");
        for (int k = 0; k < i; k++) {
            for (int g = 0; g < j; g++) {
                System.out.printf("%4d", matrix1[k][g]);
            }
            System.out.println();
        }

        int[][] value = new int[matrix1[0].length][matrix1[0].length];
        for (int k = 0; k < i; k++) {
            for (int g = 0; g < matrix1[k].length; g++) {
                value[g][k] = matrix1[k][g];
            }
        }
        System.out.println("Новая матрица:");
        for (int g = 0; g < j; g++) {
            for (int k = 0; k < i; k++) {
                System.out.printf("%4d", matrix1[k][g]);
            }
            System.out.println();
        }
    }
}
