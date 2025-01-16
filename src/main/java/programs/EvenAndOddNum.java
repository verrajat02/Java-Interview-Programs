package programs;

import java.util.Scanner;

public class EvenAndOddNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		int evenCount = 0;
		int oddCount = 0;
		
		while(num>0) {
			
			int rem = num%10;
			if(rem%2==0) {
				evenCount++;
				
			}
			else {
				oddCount++;
				
			}
			num =num/10;
		}
		
		System.out.println("Even count is :"+evenCount);
		System.out.println("Odd Count is : "+oddCount);

	}

}
