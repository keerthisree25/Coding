import java.util.Arrays;

public class Array_Max {
	public static void main(String[] args) {

		int arr[] = { 51, 29, 36, 44, 15 };
		Arrays.sort(arr);
		System.out.println("The sorted array is " + Arrays.toString(arr));
		int size = arr.length;
		int max = arr[size - 3];
		System.out.println("The third highest number in the array is " + max);
        
		int array[] = { 22, 31, 45, 11, 9 }; //without using sort method
		int temp;
		int size1 = array.length;
		for (int i = 0; i < size1; i++) {
			for (int j = i + 1; j < size1; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		int max1 = array[size - 3];
		System.out.println("The 3rd highest number in the array is " + max1);
	}
}