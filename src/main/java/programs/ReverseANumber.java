package programs;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number ");
		int num = sc.nextInt();
		int rev = 0;
		while (num != 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse of the number is "+ rev);
		
		
		System.out.println("=================================");
		System.out.println("Using String Buffer class");
		
		StringBuffer sb =  new StringBuffer(String.valueOf(rev));
		System.out.println("Again Reverse of the number is "+sb.reverse());
		
		
		System.out.println("====================================");
		System.out.println("Using String Bulider class");
		
		int newRev = 9876;
		StringBuilder sd = new StringBuilder(String.valueOf(newRev));
		//sd.append(newRev);
		System.out.println("Reversing the number using StringBuilder Class"+ sd.reverse());

	}

}
