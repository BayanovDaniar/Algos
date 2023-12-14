package Fun.oct3;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String test = "ÚÂÒÚ";
        byte[] arr = new byte[0];
        try {
            arr = test.getBytes("cp1251");
            System.out.println(Arrays.toString(arr));
            System.out.println(new String(arr, "cp1251"));
            System.out.write(arr, 0, arr.length);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            System.exit(1);
        }

        String alpha = "ABCDEFGHabcdefgh0123456789¿¡¬√ƒ≈®∆«‡·‚„‰Â∏ÊÁ";
        byte[] cp1251 = alpha.getBytes("cp1251");
        byte[] cp866 = alpha.getBytes("cp866");
        byte[] koi8_r = alpha.getBytes("koi8-r");

        System.out.printf("%6s %7s %7s %7s\n", "char", "cp1251", "cp866", "koi8-r");
        for (int i = 0; i < cp866.length; i++) {
            System.out.printf("%6s %7s %7s %7s\n", alpha.charAt(i), cp1251[i], cp866[i], koi8_r[i]);
        }


    }
}
