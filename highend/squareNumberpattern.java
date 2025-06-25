import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0;i<n;i++) {
		    
		    int count = n;
		    int t;
		    if (i >= (int) (n/2)-1) {
		        t = n-i-1;
		    }
		    else {
		        t = i;
		    }
		    for(int j=0;j<n;j++) {
		        if (j < t) {
		            System.out.print(count);
		            count -= 1;
		        }
		        else if (j >= t && j <= n-t-1) {
		            System.out.print(count);
		        }
		        else if (j > n-t-1){
		            count += 1;
		            System.out.print(count);
		        }
		    }
		    System.out.println();
		}
	}
}
