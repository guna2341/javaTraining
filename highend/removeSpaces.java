import java.util.Scanner;

public class Main
{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = in.nextLine();
		for(int i=0;i<input.length();i++) {
		    if (input.charAt(i) == ' ') {
		        continue;
		    }
		    System.out.print(input.charAt(i));
		}
	}
}
