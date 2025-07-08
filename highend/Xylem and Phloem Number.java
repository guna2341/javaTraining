import java.util.Scanner;
import java.util.Arrays;

class test {

    public static boolean prime(int n) {
        for(int i=2;i<=(int)n/2;i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num:");
        int n = in.nextInt();
        String str = n + "";
        int extreme = (str.charAt(0)-'0') + (str.charAt(str.length()-1) - '0');
        int mid = 0;
        for(int i=1;i<str.length()-1;i++) {
            mid += (str.charAt(i)-'0');
        }
        System.out.println(extreme == mid ? "Xylem" : "Phloem");
    }
}



