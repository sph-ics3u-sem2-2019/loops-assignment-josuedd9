package problem3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read in a word and print out one character per String
		Scanner in=new Scanner(System.in);
		String word="a";
		System.out.println("Give me a word");
		word=in.nextLine();
		for (int x=0;x<word.length();x++) {
			System.out.println(word.charAt(x));
			}
		
	}
}



