package proc.loop.quickSort;

public class QuickSort {

	
	public static void swap(int[] arr, int index1, int index2)
	{
	      int tmp = arr[index1];
	      arr[index1] = arr[index2];
	      arr[index2] = tmp;
	}


	 
	public static void quickSort(int arr[], int left, int right) {
	      int i = left;
	      int j = right;
	      
	      int pivot = arr[(left + right) / 2];

	      do
	      {
	            while(arr[i] < pivot && i < right) i++;
	            while(arr[j] > pivot && j > left) j--;

	            if(i <= j)
	            {
	                  swap(arr, i, j);
	                  i++;
	                  j--;
	            }
	      }
	      while(i <= j);

	      if(left < j) quickSort(arr, left, j);
	      if(right > i) quickSort(arr, i, right);
	}
}
