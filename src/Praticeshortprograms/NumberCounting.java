package Praticeshortprograms;

public class NumberCounting {
	public static void main(String[] args) {
		long num = 432354657675456l;
		int count = 1;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		System.out.println(count);
	}

}
