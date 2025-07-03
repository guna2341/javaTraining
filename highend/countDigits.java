import java.util.Scanner;

class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a num:");
        int n = in.nextInt();
        int t = n;
        int count = 0;
        while (t>0) {
            int r = t%10;
            if (n%r == 0) {
                count += 1;
            }
            t/=10;
        }
        System.out.print(count);
    }
}
