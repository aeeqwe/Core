package proc.loop.mergeSort;
import proc.loop.arrayMerger.Merger;
public class mergeSort {
	public static int[] sort(int[] a, int from, int len) {
		if (len == 0) {
			return new int[0];
		} else if (len == 1) {
			return new int[] { a[from] };
		} else if (len == 2) {
			if (a[from] > a[from + 1]) {
				return new int[] { a[from + 1], a[from] };
			} else {
				return new int[] { a[from], a[from + 1] };
			}
		}
		
		else {
			int [] left = sort (a, from, (len/2));
			int [] right = sort (a, from + (len/2), len - (len/2));
			return Merger.merge(left, right);
		}
		
		
		
		
	}
	
}
