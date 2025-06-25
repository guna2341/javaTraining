import java.util.Scanner;
import java.util.Arrays;

public class Main
{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = in.nextLine();
		String[] words = input.split(" ");
		String res = "";
		for(String word:words) {
		    if (word.length() > res.length()) {
		        res = word;
		    }
		}
		System.out.print(res);
	}
}
