import java.util.Random;

public class test {

    public static void main(String[] args) {
        System.out.println("EJFIEO" + Math.sqrt(12.0));

        int N = 50;

        double [] array = new double[N];
        Random random = new Random(12);
        for(int i = 0; i < N; i++){
            array[i] = random.nextDouble();
        }


        for (int i = 0; i < N; i++) {
            double x = 1.0 * i / N;
            double y = array[i] / 2.0;
            double wr = 0.5 / N;
            StdDraw.filledRectangle(x,y,wr,y);

        }


    }

}
