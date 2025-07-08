import java.util.Scanner;
import java.util.Arrays;

class test {

    public static boolean prime(int n) {
        for(int i=2;i<=(int)n/2;i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num:");
        int n = in.nextInt();
        boolean ind = false;
        for(int i=2;i<n;i++) {
           if (prime(i)) {
               if (!ind) {
                   System.out.print(i + " ");
                   ind = true;
               }
               else {
                   ind = false;
               }
           }
        }
    }
}



