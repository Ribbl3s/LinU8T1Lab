import java.math.*;
public class Main {
    public static void main(String[] args) {
        int numDigits = 50;
        BigDecimal sum = BigDecimal.ZERO;
        BigDecimal sixteen = BigDecimal.valueOf(16);
        BigDecimal one = BigDecimal.ONE;
        for (int k = 0; k < numDigits; k++) {
            BigDecimal a = BigDecimal.valueOf(4).divide(BigDecimal.valueOf(8 * k + 1), numDigits, BigDecimal.ROUND_HALF_UP);
            BigDecimal b = BigDecimal.valueOf(2).divide(BigDecimal.valueOf(8 * k + 4), numDigits, BigDecimal.ROUND_HALF_UP);
            BigDecimal c = BigDecimal.valueOf(1).divide(BigDecimal.valueOf(8 * k + 5), numDigits, BigDecimal.ROUND_HALF_UP);
            BigDecimal d = BigDecimal.valueOf(1).divide(BigDecimal.valueOf(8 * k + 6), numDigits, BigDecimal.ROUND_HALF_UP);
            BigDecimal term = a.subtract(b).subtract(c).subtract(d).divide(BigDecimal.valueOf(Math.pow(16, k)), numDigits, BigDecimal.ROUND_HALF_UP);
            sum = sum.add(term);
        }
        System.out.println(sum);
        }
    }
