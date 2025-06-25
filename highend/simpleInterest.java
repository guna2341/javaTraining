package highend;

import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double p,t,r;
        System.out.println("Enter principal amount:");
        p = in.nextDouble();
        System.out.println("Enter Time:");
        t = in.nextDouble();
        System.out.println("Enter Rate of interest:");
        r = in.nextDouble();
        System.out.println((p*t*r)/100);
    }
}
