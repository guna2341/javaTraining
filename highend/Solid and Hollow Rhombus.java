import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num:");
        int n = in.nextInt();
        
        // solid
        for(int i=0;i<n;i++) {
            for(int j=0;j<n-i;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<n;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // hollow
         for(int i=0;i<n;i++) {
            for(int j=0;j<n-i;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<n;j++) {
               if (j==0 || j==n-1 || i==0 || i==n-1) {
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
