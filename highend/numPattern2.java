import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = 0;
        for(int i=1;i<=n;i++) {
            t += i;
            
            for(int j=0;j<n-i;j++) {
                System.out.print(" ");
            }
            
            for(int j=t;j>t-i;j--) {
                System.out.print(j + " ");
            }
        System.out.println();
        }
        for(int i=3;i>0;i--) {
            
            for(int j=0;j<n-i-1;j++) {
                System.out.print(" ");
            }
            
            for(int j=i;j>=0;j--) {
                System.out.print(t + " ");
                t -= 1;
            }
            System.out.println();
        }
    }
}
