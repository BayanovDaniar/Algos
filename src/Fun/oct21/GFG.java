package Fun.oct21;

import java.io.*;
import java.util.*;

class GFG {

    // Function to merge arrays
    static void mergeArrays(int a[], int b[], int n, int m)
    {
        Map<Integer,Boolean> mp = new TreeMap<Integer,Boolean>();

        for(int i = 0; i < n; i++)
        {
            mp.put(a[i], true);
        }
        for(int i = 0;i < m;i++)
        {
            mp.put(b[i], true);
        }

        for (Map.Entry<Integer,Boolean> me : mp.entrySet())
        {
            System.out.print(me.getKey() + " ");
        }
    }

    // Driver Code
    public static void main (String[] args)
    {
        int a[] = {1, 3, 5, 7}, b[] = {2, 4, 6, 8};
        int size = a.length;
        int size1 = b.length;

        // Function call
        mergeArrays(a, b, size, size1);
    }
}
