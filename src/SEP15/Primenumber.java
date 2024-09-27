package SEP15;

public class Primenumber {
	public static void main(String[] args) {
		// int[] arr = { 25, 568, 584, 26, 45, 85 };
		int prm = 0;
		int nonPrm = 0;
		for (int num = 1; num <= 100; num++) {
			if (isPrime(num)) {
				System.out.println(num + " is prime");
				prm++;
			} else {
				System.out.println(num + " is not a prime");
				nonPrm++;
			}
			// System.out.println(num + " is " + (isPrime(num) ? "Prime" : "Not Prime"));
		}
		System.out.println("total prime nume is: "+prm);
		System.out.println("total not prime nume is: "+nonPrm);
	}

	private static boolean isPrime(int num) {
		if (num <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
