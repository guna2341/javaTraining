import java.util.Scanner;
import java.util.Arrays;

class Main {
    
    public static int fact(int n) {
        int res = 1;
        for(int i=2;i<=n;i++) {
            res *= i;
        }
        return res;
    }
    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a num:");
       int n = in.nextInt();
       int t = n;
       int sum = 0;
       while (t > 0) {
           sum += fact(t%10);
           t /= 10;
       }
       System.out.print(sum == n);
    }
}





