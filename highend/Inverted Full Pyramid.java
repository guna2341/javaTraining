import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num:");
        int n = in.nextInt();
        for(int i=n;i>=0;i--) {
            for(int j=0;j<n-i;j++) {
                System.out.print("  ");
            }
            for(int j=0;j<(i*2)-1;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
