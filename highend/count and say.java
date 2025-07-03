import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String res = "1";
        System.out.print("Enter a num:");
        int n = in.nextInt();
        for(int i=0;i<n-1;i++) {
            String temp = "";
            int count = 0;
            char t = res.charAt(0);
            for(int j=0;j<res.length();j++) {
                    if (t!=res.charAt(j)) {
                        temp += count + "" + t;
                        count = 0;
                        t = res.charAt(j);
                    }
                        count += 1;
                        if (j == res.length()-1) {
                              temp += count + "" + t;
                        }
            }
            res = temp;
        }
        System.out.print(res);
    }
}
