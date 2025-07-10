import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter String:");
        String str = in.nextLine();
        for(int i=0;i<str.length();i++) {
            boolean flag = false;
            for(int j=0;j<str.length();j++) {
                if (i==j) {
                    continue;
                }
                if (str.charAt(i) == str.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.print(str.charAt(i));
                return;
            }
        }
        System.out.print("No characters found");
    }
}
