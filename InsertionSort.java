import java.util.*;

public class InsertionSort {
	public static void insertionSort(int arr[]) {
		int len = arr.length;
		for (int i = 1; i < len; i++) {

			System.out.println(arr[i]);
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && key < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		int array[] = { 15, 11, 7, 9, 10 };
		insertionSort(array);
		System.out.println("The sorted array is: " + Arrays.toString(array));
	}
}