import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.next().charAt(0);
        if ( (c >= 'a' && c <='z') || (c >= 'A' && c <= 'Z') ) {
            System.out.print("Alphabets");
        }
        else if (c >= '0' && c <= '9') {
            System.out.print("Digits");
        }
        else {
            System.out.print("Special characters");
        }
    }
}
