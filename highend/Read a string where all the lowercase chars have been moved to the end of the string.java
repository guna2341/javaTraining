import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = in.nextLine();
        for(int i=0;i<str.length();i++) {
            if ((str.charAt(i) >=65 && str.charAt(i) <= 90) || str.charAt(i) == ' ') {
                System.out.print(str.charAt(i));
            }
        }
        for(int i=0;i<str.length();i++) {
            if ((str.charAt(i) >=97 && str.charAt(i) <= 122) || str.charAt(i) == ' ') {
                System.out.print(str.charAt(i));
            }
        }
    }
}
