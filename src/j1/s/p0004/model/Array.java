package j1.s.p0004.model;

public class Array {
    private final int[] data;

    public Array(int n) {
        this.data = new int[n];
    }

    public void fill(int max) {
        java.util.Random r = new java.util.Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = r.nextInt(max + 1);
        }
    }

    public int[] copy() {
        return java.util.Arrays.copyOf(data, data.length);
    }

    public String toString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) sb.append(", ");
        }
        return sb.toString();
    }

    public String toString() {
        return toString(data);
    }

    public void sort() {
        sort(0, data.length - 1);
    }

    private void sort(int left, int right) {
        int i = left;
        int j = right;
        int pivot = data[left + (right - left) / 2];
        while (i <= j) {
            while (data[i] < pivot) i++;
            while (data[j] > pivot) j--;
            if (i <= j) {
                int tmp = data[i];
                data[i] = data[j];
                data[j] = tmp;
                i++;
                j--;
            }
        }
        if (left < j) sort(left, j);
        if (i < right) sort(i, right);
    }
}


