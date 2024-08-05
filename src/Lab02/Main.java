package Lab02;

import java.math.BigDecimal;

public class Main {
	public static int findMax(int arr[]) {
		int n=arr.length;
		int max = arr[0];
		for(int i= 0;i< n; i++){
			if(arr[i]>max) 
				max = arr[i];
		}
		return max;
	}
	
	private static int sumEvenNumbers(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		int sum = 0;
		for(int i= 0;i < n; i++){
			if(arr[i]%2==0) sum += arr[i];
		}
		return sum;
	} 
	
	public static int findMin(int arr[]) {
		int n=arr.length;
		int min = arr[0];
		for(int i= 0;i < n; i++){
			if(arr[i]<min) 
				min = arr[i];
		}
		return min;
	}
	
	
	public static void main(String[] args) {
		int[] arr1 = {3, 1, 4, 1, 5, 9, 2};
        System.out.println("Max: " + findMax(arr1));
        System.out.println("Min: " + findMin(arr1));
        System.out.println("Sum of even numbers: " + sumEvenNumbers(arr1));
        int elementToCount = 1;
        System.out.println("Count of element " + elementToCount + ": " + countSpecificElement(arr1, elementToCount));
        System.out.println("Count of prime numbers: " + countPrimeNumbers(arr1));
        int elementToFind = 5;
        System.out.println("Index of element " + elementToFind + ": " + find(arr1, elementToFind));

        // Test square
        square(arr1);
        System.out.print("Array after squaring elements: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();

//        // Test findMax with BigDecimal
//        BigDecimal[] arr2 = {new BigDecimal("3.5"), new BigDecimal("1.2"), new BigDecimal("4.8")};
//        System.out.println("Max BigDecimal: " + findMax(arr2));
//
//        // Test divisibleNumbers
//        int k = 2;
//        int[] divisible = divisibleNumbers(arr1, k);
//        System.out.print("Elements divisible by " + k + ": ");
//        for (int num : divisible) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//
//        // Test thirdLargest
//        int[] arr3 = {3, 1, 4, 1, 5, 9, 2};
//        System.out.println("Third largest element: " + thirdLargest(arr3));
	}
	public static BigDecimal findMax(BigDecimal []arr) {
		// TODO Auto-generated method stub
		
		return null;
	}

	private static String thirdLargest(int[] arr3) {
		// TODO Auto-generated method stub
		return null;
	}

	private static int[] divisibleNumbers(int[] arr1, int k) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void square(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		int count=0;
		for(int i = 0; i < n; i++){
			arr[i] = arr[i]*arr[i];
		}
	}

	private static boolean isPrime(int a) {
		if(a==1||a==0) return false;
		
		for(int i = 2;i<=Math.sqrt(a);i++) {
			if(a % i == 0) return false;
		}
		return true;
	}
	private static int countPrimeNumbers(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		int count=0;
		for(int i = 0; i < n; i++){
			if(isPrime(arr[i])==true) count++;
		}
		return count;
	}

	private static int countSpecificElement(int[] arr, int elementToCount) {
		// TODO Auto-generated method stub
		int n=arr.length;
		int count=0;
		for(int i= 0;i <n; i++){
			if(arr[i]==elementToCount) count++;
		}
		return count;
	}

	public static int find(int arr[], int k) {
		int n=arr.length;
		int count=0;
		for(int i= 0;i < arr.length; i++){
			if(arr[i]==k) return i;
		}
		return -1;
	}
	
}
