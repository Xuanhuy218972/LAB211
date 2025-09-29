package j1.s.p0004.view;

public class Show {
    public void print(int[] before, int[] after) {
        System.out.println("Unsorted array: " + toString(before));
        System.out.println("Sorted array:   " + toString(after));
    }

    private String toString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) sb.append(", ");
        }
        return sb.toString();
    }
}


