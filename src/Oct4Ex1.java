import java.util.Arrays;

// Binary search
public class Oct4Ex1 {

    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] whiteList = {12,4,2,435,46,1,45,3};
        Arrays.sort(whiteList);
        while(!StdIn.isEmpty()){
            int key = StdIn.readInt();
            if(rank(key,whiteList) < 0)StdOut.println(key);
        }

    }
}
