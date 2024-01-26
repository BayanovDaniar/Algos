package Fun.sep29;

import java.util.Date;
import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
        Random random = new Random(new Date().getTime());
        System.out.println(random.nextInt(12));
        System.out.println(random.nextBoolean());
        System.out.println(random.nextDouble());
        random.setSeed(23);

        byte[] array = new byte[10];
        random.nextBytes(array);
        for(byte i : array){
            System.out.println(i);
        }

        int i = (int) (Math.random() * 10);
        System.out.println(i);


    }
}
