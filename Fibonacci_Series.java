import java.util.*;
public class Fibonacci_Series{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of terms: ");
		int count=sc.nextInt();
		
		System.out.println("Fibonacci series ");
		int firstTerm=0;
		int secondTerm=1;
		
		System.out.print(firstTerm + " " + secondTerm);
		
		for(int i=2; i<=count; i++) {
			int nextTerm = firstTerm + secondTerm;
			System.out.print(" "+nextTerm);
			
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
}

