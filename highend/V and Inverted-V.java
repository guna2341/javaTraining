import java.util.Scanner;
import java.util.Arrays;

class test {
    public static void main(String[] args) {
        System.out.print("Enter num:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++) {
            for(int j=0;j<n-i-1;j++) {
                System.out.print(" ");
            }
            System.out.print((char)('A' + n-i-1));
            for(int j=0;j<(i*2)-1;j++) {
                System.out.print(" ");
            }
            if (i!=0) {
                System.out.print((char) ('A' + n - i - 1));
            }
            System.out.println();
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<i;j++) {
                System.out.print(" ");
            }
            System.out.print((char) ('A' + n - i - 1));
            for(int j=0;j<((n-i-1)*2)-1;j++) {
                System.out.print(" ");
            }
            if (i!=n-1) {
                System.out.print((char) ('A' + n - i - 1));
            }
            System.out.println();
        }
    }
}



