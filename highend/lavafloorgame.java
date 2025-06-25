
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int score = in.nextInt();
        if (score >= 90 && score <= 100) {
            System.out.print("Safe zone.");
        }
        else if (score >= 70 && score <= 89) {
            System.out.print("Warning zone.");
            if (score % 5 == 0) {
                System.out.print("Shield activated.");
            }
        }
        else if (score >= 50 && score <= 69) {
            System.out.print("Burn zone.");
            if (score % 2 == 0) {
                System.out.print("Chance to escape.");
            }
        }
        else if (score >=0 && score <= 49) {
            System.out.print("Lava death.");
        }
        else if (score > 0 && score <= -100) {
            System.out.print("Game error.");
        }
    }
}
