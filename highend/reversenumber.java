import java.util.Scanner;

class reversenumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a num:");
        int num = in.nextInt();
        int rev = 0;
        while (num > 0) {
            rev = (rev*10) + (num%10);
            num /=10;
        }
        System.out.print(rev);
    }
}