import java.util.Scanner;
import java.util.Arrays;

public class Main
{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word = "hello";
		char[] array = word.toCharArray();
		for(int i=0;i<2;i++) {
		    char temp = array[word.length()-1];
		    for(int j=word.length()-1;j>0;j--) {
		        array[j] = array[j-1];
		    }
		    array[0] = temp;
		}
		System.out.print(Arrays.toString(array));
	}
}
