package programs;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the String :");
		String main = sc.next();
		String rev ="";
		int len =main.length();
		
		for(int i =len-1;i>=0;i--) {
			
			rev = rev+main.charAt(i);
			
		}
		
		if(rev.equalsIgnoreCase(main)) {
			
			System.out.println("String is Palindrom");
		}
		else {
			System.out.println("String is not palindrom");
		}

	}

}
