package programs;

import java.util.Scanner;

public class LongestWord {

	
	public static String longWOrd(String sen) {
		String cleanSent= sen.replaceAll("[^a-zA-z0-9]", " ");
		String[]  words = cleanSent.split(" ");
		String longestWord = " ";
		for(String word:words) {
			if(word.length()>longestWord.length()) {
				longestWord=word;
			}
		}
		
		return longestWord;
	}
	public static void main(String[] args) {
		Scanner s  =new Scanner(System.in);
		System.out.println("Enter the sentence");
		String inputsen = s.nextLine();
	String result = longWOrd(inputsen);
	System.out.println(result);

	}

}
