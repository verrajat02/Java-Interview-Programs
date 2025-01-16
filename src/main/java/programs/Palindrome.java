package programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int inputNum = sc.nextInt();
		int num = inputNum;
		int rev =0;
		
		while(num!=0) {
			rev = rev*10+num%10;
			num =num/10;
			
		}
		System.out.println(rev);

		if(rev== inputNum) {
			System.out.println("Entered Number is Palindrom");
		}
		else
			System.out.println("Entered Number is Not Palindrom");
	}

}
