import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        char c = in.next().charAt(0);
        if (c == '+') {
            System.out.print(a + b);
        }
        else if (c == '-') {
            System.out.print(a - b);
        }
        else if (c == '/') {
            System.out.print(a / b);
        }
        else if (c == '%') {
            System.out.print(a % b);
        }
        else if (c == '*') {
            System.out.print(a * b);
        }
        else {
            System.out.print("Enter valid operation.");
        }
    }
}
