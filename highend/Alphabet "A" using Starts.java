import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    System.out.print("Enter 2 strings:");
	    int n = in.nextInt();
	    for(int i=0;i<n;i++) {
	        for(int j=0;j<=n/2;j++) {
	            if (i==0 && j!=0 && j!=(n/2)) {
	                System.out.print("*");	            }
	            else if (((j==0 || j==(n/2)) && i!=0) || i==(n/2)) {
	                System.out.print("*");
	            }
	            else {
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	}
}


