import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter String:");
        String str = in.nextLine();
        String[] arr = str.split("\\.");
        for(int i=arr.length-1;i>=0;i--) {
            if (arr[i] == "") {
                continue;
            }
            if (i == arr.length-1) {
                System.out.print(arr[i]);
                continue;
            }
            System.out.print("." + arr[i]);
        }
    }
}
