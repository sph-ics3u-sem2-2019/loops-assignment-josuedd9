package problem2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read in two numbers. Add up all the values between them
		Scanner in=new Scanner(System.in);
int num1=0;
int num2=0;
	System.out.println("give me first numbers");
	num1=in.nextInt();
	System.out.println("give me second number");
	num2=in.nextInt();
	int total=0;
	for (int counter=num1;counter<=num2;counter++){
		total=total+counter;
	}	System.out.println(total);
	}

}


