import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num:");
        int n = in.nextInt();
        for(int i=0;i<n;i++) {
           for(int j=0;j<n;j++) {
               if (i==0 || i == n-1 || j==0 || j==n-1) {
                   System.out.print("*");
               }
               else if ((int)(i/2) == n/2) {
                   System.out.print("*");
               }
               else if (i==j || (n-i-1) == j) {
                   System.out.print("*");
               }
               else {
                    System.out.print(" ");
                   }
           }
           System.out.println();
        }
    }
}
