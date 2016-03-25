package proc.loop.mergeSort;

import java.util.Arrays;


public class mergeSortTest {


		public static void main(String[] args) {
	        System.out.println("MergeSortTest");
	        
	       
	        	int[] arr0 ={};
	            System.out.print(Arrays.toString(arr0) + " -> ");
	            System.out.println(Arrays.toString(mergeSort.sort(arr0, 0, 0 )));
	        	int[] arr1 = {1};
	            System.out.print(Arrays.toString(arr1) + " -> ");
	            System.out.println(Arrays.toString(mergeSort.sort(arr1, 0, 1 )));
	        	int[] arr2 = {3,2};
	            System.out.print(Arrays.toString(arr2) + " -> ");
	            System.out.println(Arrays.toString(mergeSort.sort(arr2, 0, 2 )));
	        	int[] arr3 = {6, 4, 2};
	            System.out.print(Arrays.toString(arr3) + " -> ");
	            System.out.println(Arrays.toString(mergeSort.sort(arr3, 0, 3 )));
	            int[] arr11 ={6, 8, 3, 100, 5, 4, 1, 2, 0, 9, 7};
	            System.out.print(Arrays.toString(arr11) + " -> ");
	            System.out.println(Arrays.toString(mergeSort.sort(arr11, 0, 11 )));
	        
	    }

}

