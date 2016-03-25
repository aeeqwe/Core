package proc.loop.bubbleSort;

import java.util.Arrays;


public class TestBubbleSort {
    public static void main(String[] args) {
        int[][] data = {
            {},
            {1},
            {0, 3, 2, 1},
            {6, 8, 3, 5, 4, 1, 2, 0, 9, 7},
        };


        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " -> ");
            BubbleSortInverted.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}
