package highend;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter area:");
        int height = in.nextInt();
        int base = in.nextInt();
        int result = height * base;
        System.out.print("Area of Traingle:" + (int)(0.5 * result));
    }
}
