/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J1.S.P0010;

/**
 *
 * @author hxhba
 */
public class LinearSearch {
    private final int[] array;

    public LinearSearch(int size) {
        this.array = new int[size];
    }

    public void addArray(int scope) {
        java.util.Random random = new java.util.Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(scope + 1);
        }
    }

    public void showArray() {
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println();
    }

    public int findElement(int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) return i;
        }
        return -1;
    }
}
