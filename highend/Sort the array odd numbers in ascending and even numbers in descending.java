import java.util.Scanner;
import java.util.Arrays;

class Main {
    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter size:");
       int n = in.nextInt();
       int[] arr = new int[n], odd = new int[5], even = new int[n];
       int o = 0, e = 0;
       for(int i=0;i<n;i++) {
           arr[i] = in.nextInt();
       }
        for(int i=0;i<n;i++) {
            if (arr[i]%2!=0) {
                odd[o] = arr[i];
                o++;
            }
        }
        Arrays.sort(odd);
        for(int i=0;i<n;i++) {
            if (arr[i]%2==0) {
                even[e] = arr[i];
                e++;
            }
        }
        Arrays.sort(even);
       for(int i=odd.length-o;i<odd.length;i++) {
           System.out.print(odd[i] + " ");
       }
       for(int i=even.length-1;i>=even.length-e;i--) {
           System.out.print(even[i] + " ");
       }
    }
}





