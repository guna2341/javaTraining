import java.util.Scanner;
import java.util.Arrays;

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
        int[] arr= new int[n];
        int t = 0;
        for(int i=2;i<n;i++) {
            if (prime(i)) {
                arr[t] = i;
                t+=1;
            }
        }
        for(int i=0;i<t;i++) {
            for(int j=i+1;j<t;j++) {
                for(int k=j+1;k<t;k++) {
                       if (i*j*k == n) {
                           System.out.print("Sphenic number");
                           return;
                       }                      
                }
            }
        }
        System.out.print("Not sphenic number");
    }
}



