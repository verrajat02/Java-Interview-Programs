package programs;

public class SumOfElementArray {

	public static void main(String[] args) {
		int a[] = { 2, 3, 4, 5, 6 ,2};
		int sum = 0;
		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];
		}
		System.out.println(sum);
	}

}
