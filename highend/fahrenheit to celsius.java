// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float f = in.nextFloat();
        float res = (f - 32) / 1.8f;
        System.out.println(res);
    }
}
