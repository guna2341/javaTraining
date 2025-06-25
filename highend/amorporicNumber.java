import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number");
        int num = in.nextInt();
        int square = num*num;
        if (num%10 == square%10) {
            System.out.print("It is amorporic number");
        }
        else {
            System.out.print("It is not amorporic number");
        }
    }
}
