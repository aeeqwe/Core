package proc.loop.arrayInverter;

import static proc.loop.arrayInverter.ArrayInverter.invert;

import java.util.Arrays;

public class ArrayInverterTest {

    public static void main(String[] args) {
        int[] arr;

        arr = new int[]{};
        System.out.print(Arrays.toString(arr) + " -> ");
        invert(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[]{0};
        System.out.print(Arrays.toString(arr) + " -> ");
        invert(arr);
        System.out.println(Arrays.toString(arr)); 

        arr = new int[]{0, 1};
        System.out.print(Arrays.toString(arr) + " -> ");
        invert(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[]{0, 1, 2};
        System.out.print(Arrays.toString(arr) + " -> ");
        invert(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.print(Arrays.toString(arr) + " -> ");
        invert(arr);
        System.out.println(Arrays.toString(arr));
    }
}
