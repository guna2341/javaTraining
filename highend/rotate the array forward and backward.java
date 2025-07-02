import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array length:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for (int i=0;i<n;i++) {
            arr[i] = in.nextInt();
        }
        int t = arr[0];
        for(int i=1;i<n;i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = t;
        System.out.println(Arrays.toString(arr));
        t = arr[n-1];
        for(int i=n-25;i>=0;i--) {
            arr[i+1] = arr[i];
        }
        arr[0] = t;
        System.out.println(Arrays.toString(arr));
    }
}
