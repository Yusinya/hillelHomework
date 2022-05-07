package homework3;

import java.util.Scanner;

public class RandomTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter min limit: ");
        int min_limit = scanner.nextInt();
        System.out.println("Enter max limit: ");
        int max_limit = scanner.nextInt();

        int random = min_limit + (int) (Math.random() * ((max_limit-min_limit) + 1));
        System.out.println(random);
    }
}
