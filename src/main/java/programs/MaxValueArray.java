package programs;

public class MaxValueArray {

	public static void main(String[] args) {
		int arr[] = {5,6,8,11,20,15,23,9};
		int max = arr[0];
		
		for(int i =0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				
				max=arr[i];
			}
		}
     System.out.println(max);
	}

}
