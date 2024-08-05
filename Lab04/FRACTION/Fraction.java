package FRACTION;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction() {
		numerator = 0;
		denominator = 1;
	}
	
	public Fraction(int num,int den) {
		if (den == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
		this.numerator = num;
		this.denominator = den;
		reduce();
	}
	
	public Fraction(Fraction f) {
		numerator = f.numerator;
		denominator = f.denominator;
	}
	
	public Fraction add(Fraction f) {
		int newNum = numerator*f.denominator + denominator*f.numerator;
		int newDen = denominator * f.denominator;
		return new Fraction(newNum,newDen);
	}
	
	public Fraction sub(Fraction f) {
		int newNum = numerator*f.denominator - denominator*f.numerator;
		int newDen = denominator * f.denominator;
		return new Fraction(newNum,newDen);
	}
	
    public Fraction mul(Fraction f) {
    	int newNum = numerator*f.numerator;
    	int newDen = denominator*f.denominator;
    	return new Fraction(newNum,newDen);
    }
    public Fraction div(Fraction f) {
    	if (f.numerator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
    	int newNum = this.numerator * f.denominator;
    	int newDen = this.denominator * f.numerator;
    	return new Fraction(newNum,newDen);
    }
    
    public void reduce() {
    	int gcd = gcd(numerator,denominator);
    	this.numerator = numerator/gcd;
    	this.denominator = denominator/gcd;
    }
    
    public int gcd(int a, int b) {
    	while(a!=b) {
    		if(a>b) {
    			a = a-b;
    		}
    		b = b-a;
    	}
    	return a;
    }
    
    public String toString() {
        return String.format("Fraction[%d, %d]", numerator, denominator);
    }
}
