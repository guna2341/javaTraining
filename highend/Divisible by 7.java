

class Main {
    public static void main(String[] args) {
        int num = 372;
        while (num > 7) {
            int rem = num % 10;
            num /= 10;
            num -= rem * 2;
        }
        System.out.print(Math.abs(num)%7 == 0 ? true : false);
    }
}
