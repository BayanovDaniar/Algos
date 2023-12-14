package Fun.oct3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex4 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^[0-9]+$");
        Matcher matcher = p.matcher("12");
        if(matcher.matches()){
            System.out.println("Соответствует шаблону");
        }else{
            System.out.println("Не соответствует шаблону");
        }

        if(Pattern.matches("^[0-9]+$", "12")){
            System.out.println("Matches");
        }else{
            System.out.println("Not matches");
        }

        System.out.println("12".matches("^[0-9]+$"));

        Pattern pattern = Pattern.compile("^[a-z]+$", Pattern.CASE_INSENSITIVE);
        Matcher matcher1 = pattern.matcher("ABCD");
        System.out.println(matcher1.matches());

        Pattern pattern1 = Pattern.compile("^[а-яё]+$");



    }
}
