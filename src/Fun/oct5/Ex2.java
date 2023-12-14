package Fun.oct5;

import java.io.*;
import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\dania\\Desktop\\wildberries\\AlgosAndLearning\\src\\Fun\\oct5\\data");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        while (bufferedReader.ready()) {
            String[] line = bufferedReader.readLine().split(" ");
            double d = Double.parseDouble(line[1]) / Double.parseDouble(line[2]);
            System.out.printf("%10s %10s %10s %10.3f\n", line[0], line[1], line[2], d);

        }
        bufferedReader.close();

    }
}
