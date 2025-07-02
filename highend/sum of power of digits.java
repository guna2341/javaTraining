import java.util.Scanner;

class Main {
    
    public static int digits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n%10;
            n/=10;
        }
        return sum;
    }
    
    public static int power(int n) {
        int res = 0;
        for(int i=0;i<n;i++) {
            res += n;
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a num:");
        int n = in.nextInt();
        System.out.print(digits(power(n)));
    }
}
