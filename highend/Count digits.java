import java.util.Scanner;
import java.util.Arrays;

class Main {
    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a num:");
       int n = in.nextInt();
       String str = n + "";
       char[] arr = str.toCharArray();
       for(int i=0;i<str.length();i++) {
           int count = 1;
           if (arr[i] == '*') {
               continue;
           }
           for(int j=0;j<str.length();j++) {
               if (i == j) {
                   continue;
               }
                if (arr[i] == arr[j]) {
                   count++;
                   arr[j] = '*';
               }
           }
           System.out.println(arr[i] + ": " +count);
           }
    }
}





