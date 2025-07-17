import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

class test {

    public static boolean palin(String str,int i,int j) {
        while (i<=j && i<str.length() && j > 0) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        if (str.length() == 1) {
            System.out.println(str);
        }
        boolean isPalin = false;
        int srt = 0,end = str.length()-1;
        for(int i=0;i<str.length();i++) {
            for(int j=str.length()-1;j>i;j--) {
                if(palin(str,i,j) && (j-i) < (end-srt)) {
                    srt = i;
                    end = j;
                    isPalin = true;
                }
            }
        }
        if (!isPalin) {
            System.out.println(str.charAt(0));
            return;
        }
        for(int i=srt;i<=end;i++) {
            System.out.print(str.charAt(i));
        }
    }
}
