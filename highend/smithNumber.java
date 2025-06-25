import java.util.Scanner;

class Main {
    
    public static boolean isPrime(int n) {
        for(int i=2;i<(int)(n/2)+1;i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static int primeFactors(int n) {
        int res = 0;
        while (n > 1) {
            for(int i=2;i<=n;i++) {
                if (isPrime(i) && n%i == 0) {
                    res += digits(i);
                    n /= i;
                    break;
                }
            }
        }
        
        return res;
    }
    
    public static int digits(int n) {
        int res = 0;
        while (n > 0) {
            int mod = n % 10;
            res += mod;
            n /= 10;
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int digitSum = 0;
        int primeSum = 0;
        digitSum = digits(n);
        primeSum = primeFactors(n);
        System.out.println("Smith Number:" + " " + (digitSum==primeSum));
    }
}
