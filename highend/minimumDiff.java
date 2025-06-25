package highend;

import java.util.Scanner;

public class minimumDiff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a num:");
        int inp = in.nextInt();
        int[] arr = new int[inp];
        for(int i=0;i<inp;i++) {
            arr[i] = in.nextInt();
        }
        int min = 9999;
        for(int i=0;i< arr.length;i++) {
            for(int j=0;j< arr.length;j++) {
                if (i == j) continue;
                if (min < (arr[i] - arr[j])) {
                    min = arr[i] - arr[j];
                }
            }
        }
    }
}
