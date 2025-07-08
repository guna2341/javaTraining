import java.util.Scanner;
import java.util.Arrays;

class test {

    public static int num(int n) {
        int res = 0;
        while (n>0) {
            res = (res*10) + (n%10);
            n /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num:");
        int n = in.nextInt();
        for(int i=0;i<n;i++) {
            if (i + num(i) == n) {
                System.out.print("Mystery Number");
                return;
            }
        }
        System.out.print("Not mystery number");
    }
}



