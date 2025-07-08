import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num:");
        int n = in.nextInt();
        in.nextLine();
        String[] str = new String[n];
        
        for(int i=0;i<n;i++) {
            str[i] = in.nextLine();
        }
        
        for(int i=0;i<str.length-1;i++) {
            if (str[i].charAt(str[i].length()-1) != str[i+1].charAt(0)) {
                System.out.print("0");
                return;
            }
        }
        System.out.print("1");
    }
}
