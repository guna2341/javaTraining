package highend;

import java.util.Scanner;

class nearestpalin {

    public static int palin(int num) {
        int rev = 0;
        while (num > 0) {
            rev = (rev*10) + (num%10);
            num /=10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a num:");
        int n = in.nextInt();
        if (n < 10 || n%10 == 0 || n == palin(n)) {
            System.out.print(n);
            return;
        }
        int right = n+1;
        int left = n-1;
        while (true) {
            if (right == palin(right)) {
                System.out.print(right);
                break;
            }
            if (left == palin(left)) {
                System.out.print(left);
                break;
            }
            right++;
            left--;
        }
    }
}