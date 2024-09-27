package SEP15;

public class OddEven {

	public static void main(String[] args) {
		// int arr[]= {1,2,34,5,66,78,99,100};
		int oddcount = 1;
		int evencount = 1;
		for (int num = 1; num <= 100; num++) {
			if (num % 2 != 0) {
				oddcount++;
				System.out.println("even number: " + num);
			} else {
				System.out.println("odd number: " + num);
				evencount++;
			}
		}
		System.out.println("even count:" + oddcount);
		System.out.println("odd count:" + evencount);

	}

}
