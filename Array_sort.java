import java.util.Arrays;

public class Array_sort {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 0, 1, 56, 23, 4 };
		int arr1[] = { 2, 9, 44, 11, 61, 32 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		String sort = Arrays.toString(arr);
		System.out.println("The sorted array is: "+sort);
		Arrays.sort(arr1);
		String sorted = Arrays.toString(arr1);
		System.out.println("The sorted array is: " + sorted);
	}
}
