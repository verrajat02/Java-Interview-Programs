package programs;

public class MissingNumArray {

	
	
	public static int getmissingNumber(int arr[] ,int n) {
		
		int sumOfNumber = n*(n+1)/2;
		int result = 0;
		for (int i =0 ;i<arr.length ;i++) {
			
			result = result+arr[i];
		}
		return sumOfNumber-result;
	}
	
	
	
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,5};
		int n = arr.length+1;
		int missingNum=getmissingNumber(arr, n);
		System.out.println(missingNum);

	}

}
