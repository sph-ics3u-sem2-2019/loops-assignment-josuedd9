package problem2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read in two numbers. Add up all the values between them
		Scanner in=new Scanner(System.in);
		int input=0;
		int input2=0;
		System.out.println("Insert number here");
		input=in.nextInt();
		System.out.println("Insert second number here");
		input2=in.nextInt();
		while (input<=input2) {
			System.out.println(input);
			input++;
			
		}  while (input>=input2) {
			System.out.println(input);
			input--;
		}
		
		
	}

}
