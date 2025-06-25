package highend;

import java.util.Scanner;
public class binaryPattern {
    public static void main(String[] args) {
        System.out.println("Enter num:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=i;j<i+i;j++) {
                System.out.print(j%2);
            }
            System.out.println();
        }
    }
}
