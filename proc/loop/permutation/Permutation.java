package proc.loop.permutation;

import java.util.Arrays;

public class Permutation {
	public static void main(String[] args) {
		int arr1[] = {0, 1, 2};
		permutation(arr1, 3);
	}
	private static void swap(int[] arr, int index1, int index2) {
		int tmp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tmp;
	}

	private static void permutation(int[] arr, int size) {
		if (size < 2) {
			System.out.println(Arrays.toString(arr));
		} else {
			for (int k = 0; k < size; k++) {
				swap(arr, k, size - 1);
				permutation(arr, size - 1);
				swap(arr, k, size - 1);
			}
		}
	}
}
