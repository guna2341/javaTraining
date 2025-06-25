import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.print("It is a century and a leap year.");
        }
        else if (year % 100 == 0 && year % 400 != 0) {
            System.out.print("It is a century.");
        }
        else if (year % 4 == 0) {
            System.out.print("It is a leap year.");
        }
        else {
            System.out.print("It is not a leap year.");
        }
    }
}
