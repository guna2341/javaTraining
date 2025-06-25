import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string:");
        String input = in.nextLine();
        String[] arr = input.split(" ");
        String[] res = new String[arr.length];
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length();j++) {
                int ind = arr[i].charAt(j) - '0';
                if (ind >=0 && ind <= 9) {
                    res[ind] = arr[i];
                    break;
                }
            }
        }
        for(int i=0;i<res.length;i++) {
            for(int j=0;j<res[i].length();j++) {
                  int ind = res[i].charAt(j) - '0';
                if (ind >=0 && ind <= 9) {
                    continue;
                }
                else {
                    System.out.print(res[i].charAt(j));
                }
            }
            System.out.print(" ");
        }
    }
}
