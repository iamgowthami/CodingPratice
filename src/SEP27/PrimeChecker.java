package SEP27;

public class PrimeChecker {

	public static void main(String[] args) {
		int[] arr = { 25, 568, 584, 26, 45, 85 };
		for(int num:arr) {
			System.out.println(num+" is "+(isprime(num)? "prime num":"not prime"));
		}



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
