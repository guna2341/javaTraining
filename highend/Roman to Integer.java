import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

class test {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        String str = in.next();
      int[] arr = new int[str.length()];
      for(int i=0;i<str.length();i++) {
          if (str.charAt(i) == 'I') {
              arr[i] = 1;
          }
          else if (str.charAt(i) == 'V') {
              arr[i] = 5;
          }
          else if (str.charAt(i) == 'X') {
              arr[i] = 10;
          }
          else if (str.charAt(i) == 'L') {
              arr[i] = 50;
          }
          else if (str.charAt(i) == 'C') {
              arr[i] = 100;
          }
          else if (str.charAt(i) == 'D') {
              arr[i] = 500;
          }
          else {
              arr[i] = 1000;
          }
      }
        int res = 0;
      for(int i=arr.length-1;i>=0;i--) {
                if (i-1 >= 0 && arr[i] > arr[i-1]) {
                    res -= arr[i-1] + arr[i-1];
                }
                    res += arr[i];
      }
        System.out.println(res);
    }
}
