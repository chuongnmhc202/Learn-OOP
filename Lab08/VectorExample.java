import java.util.Scanner;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of vector X: ");
        int n = scanner.nextInt();
        Vector<Integer> X = new Vector<>(n);
        Vector<Integer> Y = new Vector<>(n);
        System.out.println("Enter the elements of vector X:");
        for(int i=0;i<n;i++) {
        	int element = scanner.nextInt();
        	X.add(element);
        }
        
        for(int i=0;i<n;i++) {
        	int x = X.get(i);
        	int y = 2*x*x +1;
        	Y.add(y);
        }
        
        System.out.println("The elements of vector Y are:");
        for(int i=0;i<n;i++) {
        	System.out.print(Y.get(i)+" ");
        }
        
	}
}
