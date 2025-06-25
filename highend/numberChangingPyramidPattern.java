import java.util.Scanner;
import java.util.Arrays;

public class Main
{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a num:");
		int n = in.nextInt();
		int c = 1;
		for(int i=0;i<n;i++) {
		    for(int j=1;j<=i+1;j++) {
		        System.out.print(c + " ");
		        c++;
		    }
		    System.out.println();
		}
	}
}
