import java.util.Scanner;
import java.util.Arrays;

class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num:");
        int n = in.nextInt();
        StringBuilder str = new StringBuilder();
        while (n>0) {
            if (n%2 == 0) {
                str.append("0");
            }
            else {
                str.append("1");
            }
            n = n/2;
        }
        int c = 0;
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i) == '1') {
                c += 1;
            }
        }
        System.out.print(c%2==0 ? "Evil Number":"Not evil Number");
    }
}



