package Fun.sep27;

import java.math.BigDecimal;

public class Ex6 {
    public static void main(String[] args) {
        System.out.println(0.3-0.1-0.1-0.1);

        BigDecimal x = new BigDecimal("0.3");
        BigDecimal y = new BigDecimal("0.1");
        x = x.subtract(y);
        x= x.subtract(y);
        x= x.subtract(y);
        System.out.println(x);



    }
}
