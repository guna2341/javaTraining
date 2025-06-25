package highend;

public class casting {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Int:" + a);
        long b = a;
        System.out.println("Long:" + b);
        double c = a;
        System.out.println("Double:" + c);
        int d = (int) c;
        System.out.println("Int:" + d);
    }
}
