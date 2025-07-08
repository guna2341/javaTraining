import java.util.Scanner;
import java.util.Arrays;

class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num:");
        int n = in.nextInt();
        String str = n + "";
        boolean inc = false;
        for(int i=0;i<str.length()-1;i++) {
            if (str.charAt(i) < str.charAt(i+1)) {
                inc = true;
            }
            if (inc && str.charAt(i) > str.charAt(i+1)) {
                System.out.print("Bouncy Number");
                return;
            }
            if (!inc && str.charAt(i) < str.charAt(i+1)) {
                System.out.print("Bouncy Number");
                return;
            }
        }
        System.out.print("Not bouncy Number");
    }
}



