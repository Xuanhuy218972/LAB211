package j1.s.p0006.model;

import java.util.Arrays;
import java.util.Random;

public class SearchArray {
    private final int[] arr;

    public SearchArray(int n) {
        this.arr = new int[n];
    }

    public void generate(int maxExclusive) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(maxExclusive);
        }
    }

    public void sort() {
        Arrays.sort(arr);
    }

    public int binarySearch(int x) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x) return m;
            if (arr[m] < x) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }

    public int[] getArray() {
        return arr;
    }
}


