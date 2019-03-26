package problem1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read a value. Print out from 1 to the input
		Scanner in=new Scanner(System.in);
		int total=0;
		int input=0;
	System.out.println("Insert number");
	input=in.nextInt();
	while (total<=input) {
		System.out.println(total);
		total++;
	}
			
  }
}

