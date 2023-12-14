package Fun.sep27;

import java.text.DecimalFormat;
import java.util.Date;

public class Ex2 {
    public static void main(String[] args) {
        //string format
        String s = String.format("Hi %s! How are you %s", "Daniar", "goods?");
        System.out.println(s);

        System.out.printf("What`s %S?\n", "shit");
        System.out.format("What`s %S?\n", "shit");

        System.out.printf("Check %b\n check №2 %b\n", "ok", null);
        System.out.printf("'World' hash-code: %h\n", "World");
        System.out.printf("Integer number : %d\n", 239294);

        System.out.printf("Real number : %f\n", 232.0411111); // double or float
        System.out.printf("Real number : %.2f\n", 232.041111);
        //flags
        System.out.printf("Real number : %+d\n", 231); // if positive print '+'
        System.out.printf("Real number : %,f\n", 13232443.43); // separator
        System.out.printf("Real number : %,23f\n", 13232443.43); //width
        String str = String.format("%1$+09.5f", 3.1415926535897); // 1$ - номер аргумента
        System.out.println(str);

        //Decimal format
        System.out.println("\n\n*********************\n DECIMAL FORMAT \n\n");
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        var value = 23.3534;
        System.out.println(decimalFormat.format(value));

        // 0 - цифра отображается всегда, даже если в номере меньше цифр (в таком случае отображается 0);
        decimalFormat.applyPattern("00000.##");
        value = 233.3;
        System.out.println(decimalFormat.format(value));

        decimalFormat.applyPattern("###.##");
        value = 2343.234;
        System.out.println(decimalFormat.format(value));

        System.out.println("\n\n*********************\n\n");


        // Обработка дат

        System.out.printf("Today is %tB\n", new Date());
        System.out.printf("Today is %tb\n", new Date());
        System.out.printf("Today is %tA %1$tB\n", new Date());
        System.out.printf("Today is %ta\n", new Date());
        System.out.printf("Today is %tY\n", new Date());
        System.out.printf("Today is %ty\n", new Date());
        System.out.printf("Today is %tm\n", new Date());
        System.out.printf("Today is %tc\n", new Date());
        System.out.printf("Today is %tD\n", new Date());
        System.out.printf("Today is %td\n", new Date());
        System.out.printf("Today is %te\n", new Date());


        System.out.println("\n\n\n");
        ///

        System.out.printf("234 : %x\n", 201); // ASCII code %x


        //binary operation
        {
            int x = 100;
            System.out.printf("%32s\n", Integer.toBinaryString(x));
            x = ~x;
            System.out.printf("%32s\n", Integer.toBinaryString(x));
        }
        {
            int x = 100, y = 75;
            int z = x & y;
            System.out.printf("%32s\n", Integer.toBinaryString(z));
        }


    }
}
