import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = 0;
        for(int i=1;i<=n;i++) {
            t += i;
            for(int j=t;j>t-i;j--) {
                System.out.print(j + " ");
            }
        System.out.println();
        }
    }
}
