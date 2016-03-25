package proc.loop.insertionSort;

public class InsertionSort {
	public static void sort(int[] arr) {
		for (int barrier = 1; barrier < arr.length; barrier++) {
			int newElem = arr[barrier];
			int location = barrier - 1;
			while (location >= 0 && arr[location] > newElem) {
				arr[location + 1] = arr[location];
				location--;
			}
			arr[location + 1] = newElem;

		}
	}
}
