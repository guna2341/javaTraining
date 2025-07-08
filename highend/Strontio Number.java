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
        n*=2;
        String str = n + "";
        if (str.length() != 4)  {
            System.out.println("Not Strontio");
            return;
        }
        if (str.charAt(str.length()/2) == str.charAt((str.length()/2)-1)) {
            System.out.println("Strontio");
        }
        else {
            System.out.println("Not Strontio");
        }
    }
}



