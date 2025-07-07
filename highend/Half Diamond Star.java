import java.util.Scanner;

class Main {
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
          for(int i=0;i<n;i++) {
            for(int j=0;j<n-i-1;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
