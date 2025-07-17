import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

class test {
    public static void main(String[] args) {
        String str = "zohocorporationteam";
        int l = str.length()+2;
        int n = 0;
        for(int i=(l)/2;i>=0;i--) {
            if (l%i==0) {
                n = i;
                break;
            }
        }
        int k = n;
        for(int i=0;i<str.length();i++) {
            if (i>n-1 && i < (n+n)-2) {
                for(int j=0;j<(n+n)-i-2;j++) {
                    System.out.print(" ");
                }
            }
            if (i<n-1) {
                System.out.print(str.charAt(i));
            }
            else if (i>(n+n)-3) {
                System.out.print(str.charAt(i));
            }
            else {
                System.out.println(str.charAt(i));
            }
        }
    }
}
