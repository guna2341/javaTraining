import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static boolean isRep(int temp,int rem) {
        int ind = 0;
        while (temp>0) {
            int t = temp%10;
            if (rem == t) {
                if (ind == 0) {
                    ind = 1;
                }
                else {
                    return false;
                }
            }
            temp /= 10;
        }
        return true;
    }

    public static int digits(int n) {
        int count = 0;
        int temp = n;
        while (n>0) {
            int rem = n%10;
            if (isRep(temp,rem)) {
              count++;
          }
          n /= 10;
      }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num:");
        int n = in.nextInt();
        System.out.println(digits(n));
    }
}
