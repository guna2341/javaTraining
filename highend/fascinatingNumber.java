// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int two = n*2;
        int three = n*3;
        String res = n + "" + two + "" + three;
        for(int i=1;i<9;i++) {
            boolean temp = false;
            for(int j=0;j<res.length();j++) {
                if (i == (res.charAt(j) - '0')) {
                    temp = true;
                    break;
                }
            }
            if (!temp) {
                System.out.print("It is not a fascinating number. ");
                return;
                
            }
        }
        System.out.print("It is a fascinating Number.");
    }
}
