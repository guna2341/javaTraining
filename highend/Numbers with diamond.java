import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num:");
        int n = in.nextInt();
        for(int i=(n/2);i>=0;i--) {
            for(int j=i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=(n/2)-i;j>=0;j--) {
                System.out.print(j+1);
            }
            for(int j=1;j<=(n/2)-i;j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
        for(int i=(n/2)-1;i>=0;i--) {
            for(int j=0;j<(n/2)-i;j++) {
                System.out.print(" ");
            }
              for(int j=i;j>=0;j--){
                System.out.print(j+1);
            }
            for(int j=1;j<=i;j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
