import java.util.Scanner;

class Main {
    
    public static boolean perfect(int n) {
        for(int i=1;i<n/2;i++) {
            if (i*i == n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int a = in.nextInt();
       if (perfect(a+1)) {
          System.out.print("Sunny");
       }
       else {
        System.out.print("Not Sunny");
       }
    }
}
