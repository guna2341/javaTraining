import java.util.Scanner;
import java.util.Arrays;

class Main {
    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a num:");
       int n = in.nextInt();
       int rev = 0;
       int temp = n;
       while (temp > 0) {
           rev = (10*rev) + (temp%10);
           temp /= 10;
       }
       System.out.print((int)Math.pow(n,rev));
    }
}





