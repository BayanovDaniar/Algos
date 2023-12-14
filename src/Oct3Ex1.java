// Euclid
public class Oct3Ex1 {
    public static void main(String[] args) {
        System.out.println(euclid(3453432,353232));

    }

    public static int euclid(int p, int q){
        if(q == 0) return p;
        int r = p % q;
        return euclid(q, r);
    }
}
