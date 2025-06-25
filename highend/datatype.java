package highend;

import java.util.Scanner;

public class datatype {
    public static void main(String[] args) {
        System.out.println("Enter a num:");
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        if ((int)a != a) {
            System.out.println("It can fit upto long.");
        }
        else if ((short)a != a ) {
            System.out.println("It can fit upto int.");
        }
        else if ((byte)a != a) {
            System.out.println("It can fit upto short.");
        }
        else {
            System.out.println("It can fit upto byte.");
        }
    }
}
