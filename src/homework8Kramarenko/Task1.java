package homework8Kramarenko;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] massive1 = new int[7];
        int[] massive2 = new int[7];
        int minNumber = 0;
        int maxNumber = 9;
        for (int i = 0; i < massive1.length; i++) {
            massive1[i] = random.nextInt(minNumber, maxNumber + 1);
            System.out.println("Massive 1: " + massive1[i]);
        }
        for (int i = 0; i < massive2.length; i++) {
            System.out.println("Введіть число:");
            massive2[i] = scanner.nextInt();
            System.out.println("Massive 2: " + massive2[i]);
        }
        Arrays.sort(massive1);
        Arrays.sort(massive2);
        System.out.println("Відсортований масив 1: " + Arrays.toString(massive1));
        System.out.println("Відсортований масив 2: " + Arrays.toString(massive2));
        int numberOfCoincidence = 0;
        for (int i = 0; i < massive1.length; i++) {
            if (massive1[i] == massive2[i]) {
                numberOfCoincidence +=1;
            }
        }
        System.out.println("Кількість співпадінь: " + numberOfCoincidence);
    }
}
