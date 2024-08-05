package FRACTION;

public class Main {
	public static void main(String[] args) {
        Fraction f1 = new Fraction(2, 4);
        Fraction f2 = new Fraction(18, 30);

        Fraction f3 = f1.add(f2);
        Fraction f4 = f1.sub(f2);
        Fraction f5 = f1.mul(f2);
        Fraction f6 = f1.div(f2);

        System.out.println("f1: " + f1);
        System.out.println("f2: " + f2);
        System.out.println("f1 + f2: " + f3);
        System.out.println("f1 - f2: " + f4);
        System.out.println("f1 * f2: " + f5);
        System.out.println("f1 / f2: " + f6);
    }
}
