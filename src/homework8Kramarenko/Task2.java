package homework8Kramarenko;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] massive = new int[10];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(0, 100);
        }

        Arrays.sort(massive);
        System.out.println(Arrays.toString(massive));
        int min = massive[0];
        int max = massive[9];
        checkValue(min, max, massive);
    }

    public static void checkValue(int min, int max, int[] massive) {
        int enteredValue = getEnteredValue();
        if (min < enteredValue && enteredValue < max) {
            if (!binarySearch(min, max, enteredValue, massive)){
                checkValue(min,max,massive);
            }
        } else {
            System.out.println("Число не входить в діапазон.");
        }
    }

    public static int getEnteredValue() {
        System.out.println("Введіть число:");
        Scanner scanner = new Scanner(System.in);
        int enteredValue = scanner.nextInt();
        return enteredValue;
    }

    public static boolean binarySearch(int min, int max, int enteredValue, int[] massive) {
        boolean contains = false;
        int maxInd = massive.length - 1;
        int minInd = 0;
        int middleInd;
        while (minInd <= maxInd) {
            middleInd = (maxInd + minInd) / 2;
            if (massive[middleInd] == enteredValue) {
                System.out.printf("Число %d рівне існуючому числу з індексом %d ", enteredValue, middleInd);
                return true;
            } else if
            (massive[middleInd] < enteredValue) {
                minInd = middleInd + 1;
            } else if
            (massive[middleInd] > enteredValue) {
                maxInd = middleInd - 1;
            } else {
                return false;
            }
        }
        return contains;
    }
}
