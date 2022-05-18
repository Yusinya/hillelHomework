package homework7Kramarenko;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть довжину масиву:");
        int arrayLength = scanner.nextInt();
        Random random = new Random();
        int minNum = -20;
        int maxNum = 20;
        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxNum-minNum) + minNum;
        }

        findMaxNumber(array);
        findMinNumber(array);
        findAverageNumber(array);
    }

    public static void findMaxNumber(int[] arrayList) {
        int maxNum = arrayList[0];
        for (int i :
            arrayList) {
            if (i > maxNum)
            maxNum = i;
        }
        System.out.println("Максимальне значення: " + maxNum);
    }

    public static void findMinNumber(int[] arrayList) {
        int minNum = arrayList[0];
        for (int i :
            arrayList) {
            if (i < minNum)
                minNum = i;
        }
        System.out.println("Мінімальне значення: " + minNum);
    }

    public static void findAverageNumber(int[] arrayList) {
        int sum = 0;
        for (int i :
            arrayList) {
            sum += i;
        }
        System.out.println("Середнє значення: " + sum / arrayList.length);
    }
}
