package Fun.oct18;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l = scanner.nextLine();
        char[] word = l.toCharArray();
        if (l.length() == 1 || l.length() == 0) System.out.println(0);
        else {

            int i = 0;
            int j = word.length - 1;
            int counter = 0;
            while (i < j) {
                if (word[i] != word[j]) counter++;
                i++;
                j--;
            }
            System.out.println(counter);
        }
    }
}
