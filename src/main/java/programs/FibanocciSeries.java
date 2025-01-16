package programs;

public class FibanocciSeries {

	public static void main(String[] args) {
		int a =0, b =1, sum =0;
		System.out.print(a +","+b +",");

		for(int i =2 ;i<=5;i++) {
			
			sum =a+b;
			System.out.print(sum +",");
			a=b;
			b=sum;
		}
		

	}

}
