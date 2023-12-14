package YandexAlgoritm4.WarmUp.C;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int xC = scanner.nextInt();
        int yC = scanner.nextInt();
        int xA = scanner.nextInt();
        int yA = scanner.nextInt();

//        System.out.println("RESULT");
        System.out.println(find(xC,yC,xA,yA));
    }

    public static double find(int xC, int yC, int xA, int yA){
        ///////////////////////////////////////////////////////////////

        double r = Math.sqrt(Math.pow(xC,2) + Math.pow(yC,2));
        double CO = r;
        double R = Math.sqrt(Math.pow(xA,2) + Math.pow(yA,2));
        double BA = R - r;
        double OB = r;

        if(R < r){
            return find(xA, yA, xC , yC);
        }


        double t =  Math.sqrt(Math.pow(r,2) * (Math.pow(xA, 2) + Math.pow(yA, 2))) / (Math.pow(xA, 2) + Math.pow(yA, 2));
        double xB = 0;
        double yB = 0;
        // ѕровер€ем, находитс€ ли точка A внутри окружности
        if (t >= 0 && t <= 1) {
            xB = xA * t;
            yB = yA * t;
        }

        double CB = r * Math.abs(Math.atan2(yC,xC) - Math.atan2(yB, xB));// length segment
        double path1 = CB + BA;
        double path2 = CO + OB + BA;

        if(path1 >=0 && path1 < path2) return path1;
        else return path2;
    }
}
