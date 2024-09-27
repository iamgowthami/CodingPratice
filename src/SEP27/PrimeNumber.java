package SEP27;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a num:");
		int num=sc.nextInt();
		if(isprime(num)) {
			System.out.println("prime number:"+num);
			
		}else {
			System.out.println("not prime number:"+num);
		}
		sc.close();

	}

	private static boolean isprime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<Math.sqrt(i);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
