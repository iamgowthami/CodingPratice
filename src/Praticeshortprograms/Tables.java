package Praticeshortprograms;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the num: ");
		int numbers = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(numbers + " x " + i + " = " + numbers * i);
		}
	}

}
