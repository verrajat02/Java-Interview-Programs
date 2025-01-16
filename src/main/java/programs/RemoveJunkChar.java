package programs;

public class RemoveJunkChar {

	public static void main(String[] args) {
	 
		String s = "#@!$%^%%Rajat*&^%$#^&*";
		
		 String removedString=s.replaceAll("[^a-zA-Z0-9]", "");
		 System.out.println(removedString);

	}

}
