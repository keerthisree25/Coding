public class Array_Missing {
 public static int missingNumber(int number[]) {
   int n=number.length+1;
   int sum=	n*(number[0]+number[number.length-1])/2;
   int sumOfArray=0;
   for(int num:number) {
	   sumOfArray+=num;
   }
   return sum-sumOfArray;
 }
 public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,7,8,9,10};
	int missing=missingNumber(arr);
	System.out.println("Missing number in the series is: "+missing);
}
}