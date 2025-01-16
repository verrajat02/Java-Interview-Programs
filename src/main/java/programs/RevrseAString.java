package programs;

public class RevrseAString {

	public static void main(String[] args) {
		String name = "Rajat";
		
		char[] arrName = name.toCharArray();
		int len = arrName.length;
		for (int i =len-1;i>=0;i--) {
			
			System.out.print(arrName[i]);
			
		}
		System.out.println();
		System.out.println("======================");
		System.out.println("Using charAt Method");
		
		int length = name.length();
		for(int i =length-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
		System.out.println();
		
		System.out.println("======================");
		System.out.println("Using StringBuffer Class");
		StringBuffer sb = new StringBuffer(name);
		System.out.println(sb.reverse());

		System.out.println("===============================");
		System.out.println("Using StringBuilder Class");
		StringBuilder sd = new StringBuilder(name);
		System.out.println(sd.reverse());
		
	}

}
