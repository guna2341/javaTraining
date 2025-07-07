import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter arr length:");
        int n= in.nextInt();
        
        String[] arr = new String[n];
        for(int i=0;i<n;i++) {
            arr[i] = in.next();
            in.nextLine();
        }
        
        String res = "";
        String temp = "";
        for(int i=0;i<arr[0].length();i++) {
            temp += arr[0].charAt(i);
            for(int j=1;j<arr.length;j++) {
                if (!arr[j].startsWith(temp)) {
                    System.out.print(res);
                    return;
                }
            }
            res = temp;
        }
        System.out.print(res);
    }
}
