import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string length:");
        int n = in.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter String array:");
        for(int i=0;i<n;i++) {
            arr[i] = in.next();
        }
        System.out.print("Enter word1:");
        String word1 = in.next();
        System.out.print("Enter word2:");
        String word2 = in.next();
        boolean word1Found = false;
        boolean word2Found = false;
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i].equals(word1)) {
                if (word2Found) {
                    System.out.print(count);return;
                }
                count = 0;
                word1Found = true;
            }
            if (arr[i].equals(word2)) {
                if (word1Found) {
                System.out.print(count); return;
                }
                    count = 0;
                    word2Found = true;
            }
            count += 1;
        }
    }
}
