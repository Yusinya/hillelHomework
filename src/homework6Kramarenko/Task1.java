package homework6Kramarenko;

public class Task1 {
    public static void main(String[] args) {

        int a = 1;
        int n = 2;
        if (a == 1) {
            System.out.println("n = " + a);
            System.out.println("n = " + a);
        }
        for (int i = 8; i > 0; i--) {
            System.out.println("n = " + n);
            n = n + n;
        }
    }
}