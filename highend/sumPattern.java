import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=1;i<=n;i++) {
		    int t = i;
		    for(int j=n;j>=i;j--) {
		        System.out.print(t + " ");
		        t += j;
		    }
		    System.out.println();
		}
	}
}
