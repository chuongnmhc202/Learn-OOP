package Lab01;

public class Ex9 {
    public static void main(String[] args) {
        hailstoneSequence(100);
    }

    public static void hailstoneSequence(int n) {
        while (n != 1) {
            System.out.print(n + " ");
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }
        System.out.println(1);
    }
}

