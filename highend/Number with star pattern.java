import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num:");
        int n = in.nextInt();
        for(int i=0;i<=n/2;i++) {
            for(int j=0;j<(n/2)-i;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++) {
                if (j==0) {
                    System.out.print(j+1);
                    continue;
                }
                System.out.print("*"+(j+1));
            }
            System.out.println();
        }
         for(int i=n/2;i>=0;i--) {
             for(int j=n/2;j>=i;j--) {
                 System.out.print(" ");
             }
             for(int j=0;j<i;j++) {
                 if (j==0) {
                    System.out.print(j+1);
                    continue;
                }
                System.out.print("*"+(j+1));
             }
             System.out.println();
         }
    }
}
