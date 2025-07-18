import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter num:");
       int n = in.nextInt();
       for(int i=0;i<n;i++) {
       for(int j=0;j<n-i;j++) {
           System.out.print((char)('A' + j));
       }
       for(int j=0;j<(i*2)-1;j++) {
           System.out.print(" ");
       }
        for(int j=n-i-1;j>=0;j--) {
            if(i == 0 && j == n-i-1) {
                continue;
            }
            System.out.print((char)('A'+j));
        }
        System.out.println();
       }
    }
}
