import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num:");
        int n = in.nextInt();
        if (n%2!=0) {
             n+=1;
        }
        for(int i=2;i<n+2;i+=2) {
            for(int j=0;j<i;j++) {
                System.out.print("* ");
            }
            System.out.println();
            for(int j=0;j<i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
