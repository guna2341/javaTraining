import java.util.Scanner;
import java.util.Arrays;

public class Main
{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = in.nextLine();
		char[] words = new char[input.length()];
		for(int i=0;i<input.length();i++) {
		    words[i] = input.charAt(i);
		}
		System.out.print(Arrays.toString(words));
	}
}
