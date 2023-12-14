package YandexAlgoritm4.WarmUp.D;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String l = scanner.nextLine();

        if(s.length() != l.length()){
            System.out.println("NO");
            System.exit(0);
        }
        int [] alphabet = new int[26];
        for(int i = 0; i < s.length(); i++){
            alphabet[s.charAt(i) - 'a']++;
            alphabet[l.charAt(i) - 'a']--;
        }
        for(int i : alphabet){
            if(i != 0){
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");
    }
}
