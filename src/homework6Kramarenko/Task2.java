package homework6Kramarenko;

public class Task2 {
    public static void main(String[] args) {

        String a = "4";
        String b = "9";
        int number = 0;
        for (int i = 0; i < 100; i++) {
            number++;
            if (String.valueOf(number).contains(a) || String.valueOf(number).contains(b)) {
            }
            else {
                System.out.println(number);
            }
        }
    }
}
