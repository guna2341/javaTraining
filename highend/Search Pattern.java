import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static boolean subString(String str,int i,String sub) {
        int c = i;
        for(int j=0;j<sub.length();j++) {
            if (str.charAt(c) != sub.charAt(j)) {
                return false;
            }
            c++;
         }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = in.nextLine();
        System.out.println("Enter subString:");
        String sub = in.nextLine();
        boolean temp = false;
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i) == sub.charAt(0) && subString(str,i,sub)) {
                temp = true;
              System.out.print(i+1 + " ");
            }
        }
        if (!temp) {
            System.out.print("-1");
        }
    }
}
