package programs;

import java.util.Scanner;

public class SumofDigit {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		   int num= sc.nextInt();
		   int sum = 0;
		   while(num>0) {
			   
			   sum = sum+num%10;
			   num = num/10;
			   
		   }
		   
		   System.out.println("Sum of the Number is: " +sum);
	}
}
