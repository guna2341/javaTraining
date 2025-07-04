import java.util.Scanner;
import java.util.Arrays;

class Main {
    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter two strings:");
       String s1 = in.next();
       String s2 = in.next();
       for(int i=0;i<s1.length();i++) {
           boolean flag =true;
           for(int j=0;j<s2.length();j++) {
               if (s1.charAt(i) == s2.charAt(j)) {
                   flag = false;
               }
           }
           if (flag) {
               System.out.print(s1.charAt(i));
           }
       }
    }
}





