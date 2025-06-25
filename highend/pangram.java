import java.util.Scanner;
import java.util.Arrays;

public class Main
{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = in.nextLine();
		char[] words = input.toCharArray();
		Arrays.sort(words);
		int n = 97;
		for(int i=0;i<words.length;i++) {
		    if (n == words[i]) {
		        n += 1;
		    }
		    if (n == 123) {
		        System.out.print("Pangram");
		        return;
		    }
		}
		System.out.print("Not a pangram");
	}
}
