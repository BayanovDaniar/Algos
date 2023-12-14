package Fun.sep29;

public class Ex2 {
    public static void main(String[] args)
    {
        System.out.println(2.0 / 0.0 * (2.0 / 0.0) * -1);
        System.out.println( (2.0 / 0.0) *  (0.0 / 0.0 ));

        System.out.println(Double.NaN);

        double i = 0.0 / 0.0;
        if(Double.isFinite(i))  // NaN or Infinite - false
            System.out.println("Is good");

    }
}
