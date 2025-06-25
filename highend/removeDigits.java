package highend;

import java.util.Arrays;
import java.util.Scanner;

public class removeDigits {
    public static void main(String[] args) {
        int[] num = new int[100];
        Scanner in = new Scanner(System.in);
        String[] str = new String[100];
        int[] nums = new int[100];
        int n = -1;
        char[][] input = {
                {'i','s','1'},
                {'T','h','i','2','s'},
                { 'T','e','3','s','t'},
                {'a','0'}
        };

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                int index = input[i][j] - '0';
                if (index >= 0 && index <= 9) {
                    n++;
                    nums[n] = index;
                    break;
                }
            }
        }
        for(int i=0;i<=n;i++) {
            int ind = nums[i];
            for(int j=0;j<input[ind].length;j++) {
                int index = input[ind][j] - '0';
                if (index > 9) {
                    System.out.print(input[ind][j]);
                }
            }
            System.out.print(" ");
        }
    }
}
