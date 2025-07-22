import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        String s1 = "abcaay", s2 = "xyzxxb";
        for(int i=0;i<s1.length();i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            for(int j=0;j<s1.length();j++) {
                if (s1.charAt(j) == c1 && s2.charAt(j) != c2) {
                    System.out.print(false);
                    return;
                }
                  if (s2.charAt(j) == c2 && s1.charAt(j) != c1) {
                    System.out.print(false);
                    return;
                }
        }
        System.out.print(true);
        }
    }



