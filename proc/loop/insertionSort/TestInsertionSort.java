package proc.loop.insertionSort;

import java.util.Arrays;


class TestInsertionSort {
    public static void main(String[] args) {
        int[][] data = {
                {},
                {1},
                {0, 3, 2, 1},
                {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7},
        };

        for (int[] arr : data) {
            System.out.println(Arrays.toString(arr) + " -> ");
            InsertionSort.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}

