package Fun.oct3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class Ex1{
    public static void main(String[] args) {

        // Codepoints
        String s = "\uD804\uDC12\uD804\uDC12";
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.codePointCount(0,s.length()));

        System.out.println("-----");
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));

        ///locale

        System.out.println(Locale.getDefault());
        System.out.println(Arrays.toString(Locale.getAvailableLocales()));
        Locale.setDefault(new Locale("ru", "RU"));
        System.out.println(Locale.getDefault());


        // compare

        System.out.println("------");
        String s1 = "XXX";
        String s2 = "John";
        System.out.println(s1.compareTo(s2)); // (> 0) if s1>s2 Лексикографический порядок


        // start with

        System.out.println("абвгде".startsWith("абв")); // true
        System.out.println("абвгде".startsWith("бвг", 1)); // true

        // Поиск и замена в строке

        String s3 = "Привет привела пример";
        System.out.println(s3.indexOf("при"));

        s3 = s3.replace("при", "не");
        System.out.println(s3);

        // join

        System.out.println(String.join(" _ ", s1, s2,s3));


    }
}

