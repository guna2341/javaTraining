package highend;

import java.util.Scanner;

public class asciivalues {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character:");
        char c = in.next().charAt(0);
        System.out.println((int)c);
    }
}
