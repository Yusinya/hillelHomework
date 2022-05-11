package homework5Kramarenko;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class task2 {
    public static void main(String[] args) {
        System.out.println(doubleToDecimalPlaces(123.139, 2));
    }
    private static double doubleToDecimalPlaces(double number, int countAfterPoint) {
        BigDecimal result = new BigDecimal(number);
        result = result.setScale(countAfterPoint, RoundingMode.HALF_EVEN);
        return result.doubleValue();
    }
}
