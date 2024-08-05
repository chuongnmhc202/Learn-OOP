package Lab01;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		System.out.print("Enter your birthday: ");
		String day = scanner.nextLine();
		System.out.print("Enter your Student ID: ");
		int id = scanner.nextInt();
		System.out.print("Name: "+name+" Birthday: "+day+" Student Id: "+id);
	}

}
