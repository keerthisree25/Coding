import java.util.*;

class Palindrome {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number/string: ");
		String reverse = "";
		String s1 = sc.nextLine();
		int length = s1.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + s1.charAt(i);
		}
		s1 = s1.toLowerCase();
		reverse = reverse.toLowerCase();
		if (s1.equals(reverse)) {
			System.out.println("The entered string/number " + s1 + " is a palindrome.");
		} else {
			System.out.println("The entered string/number " + s1 + "  isn't a palindrome.");
		}
	}
}