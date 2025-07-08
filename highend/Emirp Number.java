import java.util.Scanner;

class Main {
    
    public static boolean prime(int n) {
        for(int i=2;i<=(int)n/2;i++) {
            if (n%i ==0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num:");
        int n = in.nextInt();
        int rev = 0;
        if (!prime(n)) {
            System.out.print("Not emirp");
            return;
        }
        while (n>0) {
            rev = (rev*10) + n%10;
            n /= 10;
        }
        if (!prime(rev)) {
                        System.out.print("Not emirp");
        }
        else {
            System.out.print("Emirp number");
        }
    }
}

