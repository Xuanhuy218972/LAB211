package j1.s.p0006.view;

import java.util.Arrays;
import j1.s.operation.Validator;

public class Show {
    public int askArraySize() {
        System.out.println("Enter number the array:");
        return Validator.checkNum(null);
    }

    public int askSearchValue() {
        System.out.println("Enter search value:");
        return Validator.checkNum(null);
    }

    public void showSortedArray(int[] array) {
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public void showFound(int value, int index) {
        if (index >= 0) {
            System.out.println("Found " + value + " at index: " + index);
        } else {
            System.out.println("Not found");
        }
    }
}


