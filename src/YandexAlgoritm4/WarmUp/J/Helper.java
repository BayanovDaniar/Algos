package YandexAlgoritm4.WarmUp.J;

import java.util.Scanner;

public class Helper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String [] a1 = new String[n];
        for(int i = 0; i < n; i++){
            a1[i] = scanner.nextLine();
        }
//        System.out.println("Enter next");
//        System.out.println();
//
        String [] a2 = new String[n];
        for(int i = 0; i < n; i++) {
            a2[i] = scanner.nextLine();
        }

        for(int i = 0; i < n; i++){
            if(!a1[i].equals(a2[i])){

                System.out.println("Different : \t" + a1[i] + " : " + a2[i] + " test : " + i);
            }
        }



    }
}
