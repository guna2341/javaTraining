// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 50;
        int b = 12;
        int c = 13;
        int res = a > b ? (a > c ? a : b > c ? b : c ) : (b > c ? b : c);
        System.out.print(res);
    }
}
