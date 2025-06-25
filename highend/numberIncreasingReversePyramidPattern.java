import java.util.Scanner;
import java.util.Arrays;

public class Main
{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a num:");
		int n = in.nextInt();
		
		for(int i=n-1;i>=0;i--) {
		    for(int j=1;j<=i+1;j++) {
		        System.out.print(j + " ");
		    }
		    System.out.println();
		}
	}
}
