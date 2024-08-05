package Array;

import java.util.Scanner;

public class ArrayUtils {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        System.out.println("Enter the elements:");
        int[] array = input(n);

        System.out.println("Max Even: " + maxEven(array));
        System.out.println("Min Odd: " + minOdd(array));
        System.out.println("Sum of Max Even and Min Odd: " + sumMEMO(array));
        System.out.println("Sum of Even Numbers: " + sumEven(array));
        System.out.println("Product of Odd Numbers: " + prodOdd(array));
        System.out.println("Index of First Even: " + idxFirstEven(array));
        System.out.println("Index of Last Odd: " + idxLastOdd(array));
    }
	
    public static int maxEven(int[] a) {
    	int max = a[0];
    	for(int i=0;i<a.length;i++) {
    		if(a[i]%2==0&& max<a[i]) max = a[i];
    	}
    	return max;
    }

    public static int minOdd(int[] a) {
    	int min = a[0];
    	for(int i=0;i<a.length;i++) {
    		if(a[i]%2!=0&& min>a[i]) min = a[i];
    	}
    	return min;
    }
    
    public static int sumMEMO(int[] a) {
    	return maxEven(a) + minOdd(a);
    }

    public static int sumEven(int[] a) {
    	int sum =0;
    	for(int i=0;i<a.length;i++) {
    		if(a[i]%2==0) sum += a[i];
    	}
    	return sum;
    }
    
    public static int prodOdd(int[] a) {
    	int prod=1;
    	for(int i=0;i<a.length;i++) {
    		if(a[i]%2!=0) prod *= a[i];
    	}
    	if(prod == 1) return -1;
    	return prod;
    }
    
    public static int idxFirstEven(int[] a) {
    	for(int i=0;i<a.length;i++) {
    		if(a[i]%2==0) return i+1;
    	}
    	return -1;
    }
    
    public static int idxLastOdd(int[] a) {
    	for(int i=a.length -1;i==0;i--) {
    		if(a[i]%2!=0) return i+1;
    	}
    	return -1;
    }
	private static int[] input(int n) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = scanner.nextInt();
		}
		return array;
	}
	

}
