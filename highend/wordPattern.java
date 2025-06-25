import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word  = "PROGRAM";
        int n = word.length();
        int l = (int)n/2;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n-i-1;j++) {
                System.out.print(" ");
            }
            for(int j = l;j<=l+i;j++) {
                if (j >= word.length()) {
                    System.out.print(word.charAt(j-n));
                }
                else {
                System.out.print(word.charAt(j));
                }
                }
            System.out.println();
        }
    }
}
