import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num:");
        int n = in.nextInt();
        String str = n + "";
        if (str.length()%2!=0) {
            System.out.print("Not tech number");
            return;
        }
        int n1=0,n2=0;
        for(int i=0;i<str.length()/2;i++) {
            n1 = (n1*10) +(str.charAt(i)-'0');
        }
        for(int i=str.length()/2;i<str.length();i++) {
            n2 = (n2*10) + (str.charAt(i)-'0');
        }
        int res = (n1+n2);
        System.out.print((res*res) == n ? "Tech number" : "Not tech number");
    }
}
