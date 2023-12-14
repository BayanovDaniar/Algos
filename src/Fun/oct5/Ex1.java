package Fun.oct5;

public class Ex1 {
    public static void main(String[] args) {

        System.out.println(lg(1));

        System.out.println(factorial(5));
        System.out.println(Math.log(factorial(5)));
        System.out.println(ln(factorial(5)));
    }

    public static int lg(int N){
        int temp = 1;
        int i = 0;
        while(temp * 2 <= N){
            temp = temp * 2;
            i++;
        }
        return i;
    }

    public static int factorial(int N){
        if(N == 1) return 1;
        return N * factorial(N-1);
    }

    public static double ln(double N){

        double temporary = 1;
        int i = 0;
        while((temporary * Math.E) <= N){
            temporary = temporary * Math.E;
            i++;
        }
        return i;
    }
}
