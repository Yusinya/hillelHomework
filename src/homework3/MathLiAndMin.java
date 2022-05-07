package homework3;

public class MathLiAndMin {
    public static void main(String[] args) {
        int li_warrior = 13;
        int li_bowman = 24;
        int li_rider = 46;
        int li_amount = 860;
        int li_sum_warrior = li_warrior * li_amount;
        int li_sum_bowman = li_bowman * li_amount;
        int li_sum_rider = li_rider * li_amount;
        int li_general = li_sum_bowman + li_sum_rider + li_sum_warrior;

        System.out.println("Загальний показник атаки армії Лі: " + li_general);

        int min_warrior = 9;
        int min_bowman = 35;
        int min_rider = 12;
        int min_amount = 860 + 860/2;
        int min_sum_warrior = min_warrior * min_amount;
        int min_sum_bowman = min_bowman * min_amount;
        int min_sum_rider = min_rider * min_amount;
        int min_general = min_sum_bowman + min_sum_rider + min_sum_warrior;

        System.out.println("Загальний показник атаки армії Мінь: " + min_general);
    }
}
