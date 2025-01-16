package programs;

public class Swapping {

	public static void main(String[] args) {

		int a = 30;
		int b = 65;
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After Swipe the value of A is " + a);
		System.out.println("After Swipe the value of B is " + b);

		System.out.println("==========================================");

		int j = 40;
		int k = 12;

		j = j * k;
		k = j / k;
		j = j / k;

		System.out.println("After swipe the value of j is " + j);
		System.out.println("After swipe the value of k is " + k);

		System.out.println("===========================================");
		
		System.out.println("Swapping Using  the Third Varaible ");
		
		int l =67;
		int m  =54;
		int n;
		
		n=l;
		l=m;
		m=n;
		System.out.println("After Swipe the value of l is "+l);
		System.out .println("After Swipe the value of m is "+m);
		
		
		int d= 10;
		int c =2;
		System.out.println(d/c);
		System.out.println(d%c);
	}
}
