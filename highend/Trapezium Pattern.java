import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num:");
        int n = in.nextInt();
        int srt = 1, end = n * (n+1);
        for(int i=0;i<n;i++) {
            for(int j=0;j<(2*i);j++) {
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++) {
                if (j == n-i-1) {
                    System.out.print(srt + "*");
                }
                else {
                System.out.print(srt + "*");
                }
                srt++;
            }
            end -= (n-i);
             for(int j=0;j<n-i;j++) {
                 if (j == n-i-1) {
                System.out.print(end+j+1);
                 }
                 else {
                System.out.print((end+j+1) + "*");
                 }
            }
            System.out.println();
        }
    }
}
