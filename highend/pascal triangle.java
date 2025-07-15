import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num:");
        int n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>(arr);

        for(int i=0;i<n;i++) {
            int c = 0;
            for(int j=0;j<=i;j++) {
                if (j == 0 || j == i) {
                    arr.add(1);
                    temp.add(1);
                }
                else {
                    arr.set(j,temp.get(c) + temp.get(c+1));
                    c += 1;
                }
            }
            for(int j=0;j<=i;j++) {
                System.out.print(arr.get(j) + " ");
            }
            System.out.println();
            Collections.copy(temp,arr);
        }
    }
}



