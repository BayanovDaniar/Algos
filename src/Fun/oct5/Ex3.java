package Fun.oct5;

public class Ex3 {
    public static void main(String[] args) {

        System.out.println(euclid(105,24));
    }

    public static int euclid(int p, int q){
        if(q == 0) return p;
        return euclid(q, p % q);
    }
}
