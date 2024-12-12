import java.util.*;
public class Bubble_Sort{
	public static void bubbleSort(int arr[]) {
		int size=arr.length;
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		int data[]= {11,36,54,24,48,5};
		bubbleSort(data);
		System.out.println("After applying bubble sort the sorted array is: "+Arrays.toString(data));
	}
}