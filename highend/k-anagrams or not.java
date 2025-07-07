import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    System.out.print("Enter 2 strings:");
	    String str1 = in.next();
	    String str2 = in.next();
	    int k = in.nextInt();
        if (str1.length() != str2.length()) {
            System.out.print(false);
            return;
        }
        if (str1 == str2) {
            System.out.print(true);
        }
	    char[] s1 = str1.toCharArray();
	    char[] s2 = str2.toCharArray();
	    Arrays.sort(s1);
	    Arrays.sort(s2);
	    for(int i=0;i<s1.length;i++) {
	    if (s1[i] != s2[i]) {
	        k-=1;
	    }
	    if (k==-1) {
	        System.out.print(false);
	        return;
	    }
	    }
	    System.out.print(true);
	}
}


