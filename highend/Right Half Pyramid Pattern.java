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
       for(int i=0;i<n;i++) {
           for(int j=0;j<=i;j++) {
               System.out.print("* ");
           }
           System.out.println();
       }
    }
}



