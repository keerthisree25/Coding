import java.util.*;
import java.math.*;
public class Prime_Number {
public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
    if(primeNumber(n)) {
    	System.out.println("Number is prime");
    }
    else {
    	System.out.println("Number is not prime");
    }
}
public static boolean primeNumber(int n) {
	if(n<=1) {
	return false;
	}
	for(int i=2;i<=Math.sqrt(n);i++) {
		if(n%i==0) {
			return false;
		}
	}
 return true;
}
}
