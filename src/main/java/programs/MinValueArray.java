package programs;

public class MinValueArray {

	public static void main(String[] args) {
		int[] arr = { 2, 7, 4, 6, 8, 11, 10, 15, 14, 17, 1 };
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];

			}
		}
		System.out.println(min);
	}

}
