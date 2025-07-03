import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = in.next();
        char t = str.charAt(0);
        String res = t + "";
        for(int i=1;i<str.length();i++) {
            if (t != str.charAt(i)) {
                res += str.charAt(i);
                t = str.charAt(i);
            }
        }
        System.out.print(res);
    }
}
