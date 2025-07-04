import java.util.Scanner;
import java.util.Arrays;

class Main {
    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a num:");
       int n = in.nextInt();
       for(int i=n-1;i>0;i--) {
           n *= i;
       }
      System.out.print(n);
    }
}





