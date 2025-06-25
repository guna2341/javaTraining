import java.util.Scanner;
import java.util.Arrays;

class Main {

    public static int countWords(String word,String arr) {
        int count = 0;
        String[] words = arr.split(" ");
        for(int i=0;i<words.length;i++) {
            if (word.equals(words[i])) {
                count +=1;
            }
        }
        return count;
    }    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter limit:");
        int n = in.nextInt();
        System.out.print("Enter a word:");
        String word = in.next();
        in.nextLine();
        String[] arr = new String[n];
        System.out.print("Enter the words:");
        for(int i=0;i<n;i++) {
            arr[i] = in.nextLine();    
        }
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if (countWords(word,arr[i]) > countWords(word,arr[j])) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
