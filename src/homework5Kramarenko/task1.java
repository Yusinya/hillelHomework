package homework5Kramarenko;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число:");
        boolean hasInter = scanner.hasNextInt();
        boolean hasDouble = scanner.hasNextDouble();

       if(hasInter) {
            int value = scanner.nextInt();
            if (value > 0) {
                System.out.println("Значення ціле і позитивне");
            }
            else {
                System.out.println("Значення ціле і негативне");
            }
        }
       else if(hasDouble) {
           double value = scanner.nextDouble();
           System.out.format("%.2f", value);
        }
       else {
           String value = scanner.nextLine();
           System.out.println(value.toUpperCase().replaceAll("\\s+",""));
       }
    }
}
