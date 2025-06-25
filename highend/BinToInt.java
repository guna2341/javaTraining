package highend;

import java.util.Scanner;

public class BinToInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.print("Enter a num:");
        int num = in.nextInt();
        int sum = 0, i = 0;
        binary(10);
    }
    static int binary(int i) {
        int sum = 0;
        String bin = "";
        while (i > 0) {
            if (i%2!=0) {
                bin += '1';
                sum += 1;
            }
            else {
                bin += '0';
            }
            i /= 2;
        }
        for(int j=bin.length()-1;j>=0;j--) {
            System.out.print(bin.charAt(j));
        }
        return 0;
    }
}
