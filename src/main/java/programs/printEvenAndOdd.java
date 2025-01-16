package programs;

import java.util.Scanner;

import org.apache.poi.hpsf.Array;

public class printEvenAndOdd {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the size of an Array");
		int size =sc.nextInt();
		int [] a = new int[size];
		System.out.println("enter all the Element");
		
		for (int i= 0;i<size;i++) {
			
			a[i]= sc.nextInt();
		}
	
	 System.out.println("Printing all the Even number :");
	 for(int i = 0 ; i<a.length;i++) {
		 if(a[i]%2==0) {
			 System.out.println(a[i]);
		 }
	 }
	 System.out.println(" ");
	 System.out.println("Printing all the odd number :");
	 for(int i=0;i<a.length;i++) {
	
		 if(a[i]%2!=0) {
		 System.out.println(a[i]);
	 }
	}
	}
}
