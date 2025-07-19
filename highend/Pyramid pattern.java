import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter num:");
       int n = in.nextInt();
       int c = 1;
       for(int i=0;i<n;i++) {
        for(int j=0;j<i+1;j++) {
           if(i%2==0) {
            System.out.print((j!=0 ? "*" : "") + c);
           }
            c++;
        }
        if(i%2!=0) {
            int t = c-1;
        for(int j=0;j<i+1;j++) {
            System.out.print((j!=0 ? "*" : "") + t);
            t--;
        }
        }
           System.out.println();
       }
    }
}
